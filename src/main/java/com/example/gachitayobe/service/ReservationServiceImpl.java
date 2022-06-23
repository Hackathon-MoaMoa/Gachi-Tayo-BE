package com.example.gachitayobe.service;

import com.example.gachitayobe.dto.ReservationDto;
import com.example.gachitayobe.dto.ReservationHistoryDto;
import com.example.gachitayobe.mapper.ReservationMapper;
import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService{
    @Autowired
    private final ReservationMapper reservationMapper;

    @Value("${coolsms.api-key}")
    private String api_key;

    @Value("${coolsms.api-secret}")
    private String api_secret;

    public ReservationServiceImpl(ReservationMapper reservationMapper){
        this.reservationMapper = reservationMapper;
    }

    public boolean createReservation(ReservationDto reservationDto){

        // 이미 예약했으면 X
        if(reservationMapper.getReservationExists(reservationDto)==1){
            return false;
        };

        // 예약 완료된 상태이면 X
        if (reservationMapper.getReservationStatus(reservationDto)==1) {
            return false;
        }

        // TODO: 트랜잭션 처리
        // member에 추가
        reservationMapper.createReservation(reservationDto);

        // 예약 인원 +1
        reservationMapper.updateReservationStatus(reservationDto);

        if (reservationMapper.getReservationStatus(reservationDto)==1) {
            // 모집 완료됐으면 SMS 발송
            String author_phone = reservationMapper.getReservationAuthor(reservationDto);
            List<HashMap<String, String>> userPhone = reservationMapper.getReservationUserPhone(reservationDto);

            String msg = "[가치타요] 탑승 모집완료! \n *탑승자\n";
            for(int i=0; i<userPhone.size(); i++){
                HashMap<String, String> user = userPhone.get(i);
                msg += user.get("name") + ", " + user.get("phone");
                msg += "\n";
            }

            Message coolsms = new Message(api_key, api_secret);

            HashMap<String, String> params = new HashMap<String, String>();
            params.put("to", author_phone);  // 수신전화번호 - 작성자
            params.put("from", "01090491765"); // 발신전화번호
            params.put("type", "SMS");
            params.put("text", msg);
            params.put("app_version", "test app 1.2"); // application name and version

            try {
                JSONObject obj = (JSONObject) coolsms.send(params);
            } catch (CoolsmsException e) {
                System.out.println(e.getMessage());
                System.out.println(e.getCode());
            }

        }

        return true;
    }

    public List<ReservationHistoryDto> getReservationHistory(int u_id){
        List<ReservationHistoryDto> result = reservationMapper.getReservationHistory(u_id);
        for(int i=0; i<result.size(); i++){
            ReservationHistoryDto history = result.get(i);
            history.setUserList(reservationMapper.getReservationUserInfo(history.getPId()));
            result.set(i, history);
        }
        return result;
    }
    public List<ReservationHistoryDto> getReservationHistoryDone(int u_id){
        List<ReservationHistoryDto> result = reservationMapper.getReservationHistoryDone(u_id);
        for(int i=0; i<result.size(); i++){
            ReservationHistoryDto history = result.get(i);
            history.setUserList(reservationMapper.getReservationUserInfo(history.getPId()));
            result.set(i, history);
        }
        return result;
    }

}
