package com.example.gachitayobe.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
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

    @Override
    public String toString() {
        return "PostDto{" +
                "uid=" + uId + '\'' +
                ", pid=" + pId + '\'' +
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
