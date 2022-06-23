package com.example.gachitayobe.service;

import com.example.gachitayobe.dto.ReservationDto;
import com.example.gachitayobe.dto.ReservationHistoryDto;

import java.util.List;

public interface ReservationService {
    boolean createReservation(ReservationDto reservationDto);
    List<ReservationHistoryDto> getReservationHistory(int u_id);
}
