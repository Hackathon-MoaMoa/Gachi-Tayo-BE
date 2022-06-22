package com.example.gachitayobe.dto;


import lombok.Getter;

@Getter
public class UserDto {
    private int uId;
    private String id;
    private String password;
    private int gender;
    private String phone;
    private String name;
    private int score;

    @Override
    public String toString() {
        return "UserDto{" +
                "uId=" + uId +
                ", id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
