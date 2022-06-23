package com.example.gachitayobe.controller;

import com.example.gachitayobe.dto.PhoneDto;
import com.example.gachitayobe.dto.UserDto;
import com.example.gachitayobe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PutMapping("/api/user/signup")
    public int insertUser(@RequestBody UserDto userDto){
        userService.insertUser(userDto);
        return userDto.getUId();
    }

    @PostMapping("/api/user/certificate")
    public String sendCertificationMessage(@RequestBody PhoneDto phoneDto){
        return userService.sendCertificationMessage(phoneDto.getPhone());
    }
}
