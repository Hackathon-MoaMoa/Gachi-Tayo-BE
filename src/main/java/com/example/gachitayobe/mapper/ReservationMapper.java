package com.example.gachitayobe.mapper;

import com.example.gachitayobe.dto.ReservationDto;
import com.example.gachitayobe.dto.ReservationHistoryDto;
import com.example.gachitayobe.dto.ReservationUserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface ReservationMapper {
    public int createReservation(ReservationDto reservationDto);
    public int getReservationExists(ReservationDto reservationDto);
    public List<ReservationHistoryDto> getReservationHistory(int u_id);
    public List<ReservationUserDto> getReservationUserInfo(int p_id);
    public int getReservationStatus(ReservationDto reservationDto);
    public void updateReservationStatus(ReservationDto reservationDto);
    public String getReservationAuthor(ReservationDto reservationDto);
    public List<HashMap<String, String>> getReservationUserPhone(ReservationDto reservationDto);
}
