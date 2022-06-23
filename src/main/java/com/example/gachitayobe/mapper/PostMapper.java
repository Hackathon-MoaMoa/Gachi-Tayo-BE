package com.example.gachitayobe.mapper;

import com.example.gachitayobe.dto.PostDetailDto;
import com.example.gachitayobe.dto.PostDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {
    public PostDetailDto getPostDetail(int p_id);
    public List<Integer> getRemainSeat(int p_id);
}
