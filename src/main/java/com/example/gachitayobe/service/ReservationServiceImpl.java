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

    public int createReservation(ReservationDto reservationDto){
        return reservationMapper.createReservation(reservationDto);
    }
}
