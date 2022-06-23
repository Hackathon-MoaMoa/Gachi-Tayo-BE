package com.example.gachitayobe.dto;

import lombok.Data;



@Data
public class PostSearchDto {
    private String startAddress;
    private String endAddress;
    private int radius;

    @Override
    public String toString() {
        return "PostSearchDto{" +
                "startAddress='" + startAddress + '\'' +
                ", endAddress='" + endAddress + '\'' +
                ", radius=" + radius +
                '}';
    }
}
