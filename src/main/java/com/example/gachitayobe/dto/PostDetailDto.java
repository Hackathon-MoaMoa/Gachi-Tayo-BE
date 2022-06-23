package com.example.gachitayobe.dto;

import lombok.Getter;

import java.sql.Timestamp;

@Getter
public class PostDetailDto {
    private int uId;
    private String name;
    private int score;
    private int pId;
    private double startX;
    private double startY;
    private String startAddress;
    private String startName;
    private double endX;
    private double endY;
    private String endAddress;
    private String endName;
    private String year;
    private String month;
    private String day;
    private String time;
    private String hour;
    private String minute;
    private int totalMember;
    private int remainMember;
    private int done;
}
