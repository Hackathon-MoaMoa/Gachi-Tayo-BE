package com.example.gachitayobe.dto;

import lombok.Getter;

@Getter
public class ReservationDto {
    private int u_id;
    private int p_id;
    private int seat_number;

    public String toString(){
        return "ReservationDto : " + u_id + " " + p_id + " " + seat_number;
    }
}