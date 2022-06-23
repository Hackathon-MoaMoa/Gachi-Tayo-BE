package com.example.gachitayobe.controller;

import com.example.gachitayobe.dto.PhoneDto;
import com.example.gachitayobe.dto.UserDto;
import com.example.gachitayobe.dto.UserLoginDto;
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
        return userService.insertUser(userDto);
    }

    @PostMapping("/api/user/certificate")
    public String sendCertificationMessage(@RequestBody PhoneDto phoneDto){
        return userService.sendCertificationMessage(phoneDto.getPhone());
    }
    //json으로 처리
    /*public String sendCertificationMessage(@RequestBody String str) throws ParseException {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(str);
        System.out.println(jsonObject.get("phone"));
        String phone=jsonObject.get("phone").toString();
        return userService.sendCertificationMessage(phone);
    }*/

    @PostMapping("api/user/login")
    public int loginUser(@RequestBody UserLoginDto userLoginDto){
        return userService.checkUser(userLoginDto);
    }
}
