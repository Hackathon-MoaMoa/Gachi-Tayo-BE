package com.example.gachitayobe.service;

import com.example.gachitayobe.dto.ReservationDto;

public interface ReservationService {
    boolean createReservation(ReservationDto reservationDto);
}
