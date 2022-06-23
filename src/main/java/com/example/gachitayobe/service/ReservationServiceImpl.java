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

        reservationMapper.createReservation(reservationDto);
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
