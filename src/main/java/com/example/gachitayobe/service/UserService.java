package com.example.gachitayobe.service;

import com.example.gachitayobe.dto.UserDto;
import com.example.gachitayobe.dto.UserLoginDto;

public interface UserService {
    int insertUser(UserDto userDto);
    String sendCertificationMessage(String phone);
    int checkUser(UserLoginDto userLoginDto);
}
