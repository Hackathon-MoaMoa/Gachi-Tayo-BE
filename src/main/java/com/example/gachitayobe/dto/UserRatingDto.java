package com.example.gachitayobe.dto;

import lombok.Getter;

@Getter
public class UserRatingDto {
    private int uid;
    private int seatNumber;
    private int plus_score;

    public String toString(){
        return "UserRatingDto{" +
                "uid=" + uid + '\'' +
                ", plus_score=" + plus_score +
                '}';
    }
}
