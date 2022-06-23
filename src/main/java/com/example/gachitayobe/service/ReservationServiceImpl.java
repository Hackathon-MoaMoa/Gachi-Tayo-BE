package com.example.gachitayobe.service;

import com.example.gachitayobe.dto.ReservationDto;
import com.example.gachitayobe.dto.ReservationHistoryDto;
import com.example.gachitayobe.mapper.ReservationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService{
    @Autowired
    private final ReservationMapper reservationMapper;

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

        // TODO: Done update -> 트리거로 처리함

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
}
