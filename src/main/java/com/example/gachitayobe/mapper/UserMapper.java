package com.example.gachitayobe.mapper;
import com.example.gachitayobe.dto.UserDto;
import com.example.gachitayobe.dto.UserLoginDto;
import com.example.gachitayobe.dto.UserRatingDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insertUser(UserDto userDto);
    UserDto checkUser(UserLoginDto userLoginDto);
    int plus_score(UserRatingDto userRatingDto);
}
