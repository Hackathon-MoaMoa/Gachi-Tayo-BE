package com.example.gachitayobe.service;

import com.example.gachitayobe.dto.ReservationDto;
import com.example.gachitayobe.mapper.ReservationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
