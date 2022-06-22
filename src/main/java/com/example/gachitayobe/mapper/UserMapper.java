package com.example.gachitayobe.mapper;
import com.example.gachitayobe.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public int insertUser(UserDto userDto);

}
