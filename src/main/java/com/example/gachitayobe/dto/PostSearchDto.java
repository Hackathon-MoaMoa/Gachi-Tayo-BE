package com.example.gachitayobe.dto;

import lombok.Getter;

import java.sql.Timestamp;

@Getter
public class PostSearchDto {
    private String startAddress;
    private String startName;
    private String endAddress;
    private String endName;
    private Timestamp startDate;
}
