package com.example.gachitayobe.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ReservationHistoryDto {
    private int pId;
    private String startAddress;
    private String startName;
    private String endAddress;
    private String endName;
    private String startDate;
    private int done;
    private List<ReservationUserDto> userList;
}
