package com.example.gachitayobe.mapper;

import com.example.gachitayobe.dto.PostDetailDto;
import com.example.gachitayobe.dto.PostDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PostMapper {
    public PostDetailDto getPostDetail(int p_id);
}
