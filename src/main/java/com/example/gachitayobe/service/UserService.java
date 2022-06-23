package com.example.gachitayobe.service;

import com.example.gachitayobe.dto.UserDto;
import com.example.gachitayobe.dto.UserLoginDto;
import com.example.gachitayobe.dto.UserRatingDto;

public interface UserService {
    int insertUser(UserDto userDto);
    String sendCertificationMessage(String phone);
    int checkUser(UserLoginDto userLoginDto);
    int plus_score(UserRatingDto userRatingDto);
}
