package com.example.gachitayobe.controller;

import com.example.gachitayobe.dto.PhoneDto;
import com.example.gachitayobe.dto.UserDto;
import com.example.gachitayobe.dto.UserLoginDto;
import com.example.gachitayobe.dto.UserRatingDto;
import com.example.gachitayobe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
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

    @PostMapping("/api/user/likes")
    public int userRating(@RequestBody UserRatingDto userRatingDto) {
        userService.plus_score(userRatingDto);
        return userRatingDto.getPlus_score();
    }
}
