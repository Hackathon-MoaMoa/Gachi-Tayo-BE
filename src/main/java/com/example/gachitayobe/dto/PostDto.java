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
    // created_at 어떻게 할지

    @Override
    public String toString() {
        return "PostDto{" +
                "uId=" + uId + '\'' +
                ", pId=" + pId + '\'' +
                ", startX=" + startX + '\'' +
                ", startY=" + startY + '\'' +
                ", startAddress=" + startAddress + '\'' +
                ", startName=" + startName + '\'' +
                ", endX=" + endX + '\'' +
                ", endY=" + endY + '\'' +
                ", endAddress=" + endAddress + '\'' +
                ", endName=" + endName + '\'' +
                ", startDate=" + startDate + '\'' +
                ", totalMember=" + totalMember + '\'' +
                ", currentMember=" + currentMember + '\'' +
                ", done=" + done + '\'' +
                "}";
    }
}
