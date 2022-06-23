package com.example.gachitayobe.mapper;

import com.example.gachitayobe.dto.ReservationDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReservationMapper {
    public int createReservation(ReservationDto reservationDto);
    public int getReservationExists(ReservationDto reservationDto);
}
