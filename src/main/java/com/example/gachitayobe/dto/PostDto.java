package com.example.gachitayobe.dto;

import lombok.Getter;

import java.sql.Timestamp;

@Getter
public class PostDto {
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
    private Timestamp startDate;
    private int totalMember;
    private int currentMember;
    private int done;
}
