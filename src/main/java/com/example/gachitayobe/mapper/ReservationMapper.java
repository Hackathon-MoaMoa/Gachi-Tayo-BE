package com.example.gachitayobe.mapper;

import com.example.gachitayobe.dto.ReservationDto;
import com.example.gachitayobe.dto.ReservationHistoryDto;
import com.example.gachitayobe.dto.ReservationUserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReservationMapper {
    public int createReservation(ReservationDto reservationDto);
    public int getReservationExists(ReservationDto reservationDto);
    public List<ReservationHistoryDto> getReservationHistory(int u_id);
    public List<ReservationUserDto> getReservationUserInfo(int p_id);
}
