package com.example.gachitayobe.dto;

import lombok.Getter;

import java.sql.Timestamp;

@Getter
public class PostDetailDto {
    private int uId;
    private int pId;
    private double startX;
    private double startY;
    private String startAddress;
    private String startName;
    private double endX;
    private double endY;
    private String endAddress;
    private String endName;
    private String startDate;
    private int totalMember;
    private int remainMember;
    private int done;
}
