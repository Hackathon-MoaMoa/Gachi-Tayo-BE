package com.example.gachitayobe.dto;


import lombok.Getter;

@Getter
public class UserDto {
    private int u_id;
    private String id;
    private String password;
    private int gender;
    private String phone;
    private String name;
    private int score;

    @Override
    public String toString() {
        return "UserDto{" +
                "u_id=" + u_id +
                ", id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
