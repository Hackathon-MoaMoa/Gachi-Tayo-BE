package com.example.gachitayobe.service;

import com.example.gachitayobe.dto.UserDto;
import com.example.gachitayobe.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public int insertUser(UserDto userDto) {
        return userMapper.insertUser(userDto);
    }

}
