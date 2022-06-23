package com.example.gachitayobe.controller;

import com.example.gachitayobe.dto.ReservationDto;
import com.example.gachitayobe.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @PostMapping("/api/reservation")
    public boolean createReservation(@RequestBody ReservationDto reservationDto){
        return reservationService.createReservation(reservationDto);
    }
}
