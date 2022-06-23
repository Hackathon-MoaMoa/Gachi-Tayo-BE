package com.example.gachitayobe.controller;

import com.example.gachitayobe.dto.ReservationDto;
import com.example.gachitayobe.dto.ReservationHistoryDto;
import com.example.gachitayobe.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @PostMapping("/api/reservation")
    public boolean createReservation(@RequestBody ReservationDto reservationDto){
        try {
            System.out.println(reservationDto);
            return reservationService.createReservation(reservationDto);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @GetMapping("/api/reservation/history/{u_id}")
    public List<ReservationHistoryDto> getReservationHistory(@PathVariable("u_id") int u_id){
        try {
            return reservationService.getReservationHistory(u_id);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

}
