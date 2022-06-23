package com.example.gachitayobe.service;

import com.example.gachitayobe.dto.PostDetailDto;
import com.example.gachitayobe.dto.PostDto;
import com.example.gachitayobe.dto.PostSearchDto;

import java.util.List;

public interface PostService {
    PostDetailDto getPostDetail(int p_id);
    List<Integer> getRemainSeat(int p_id);
    List<PostDto> getAllPosts();

}
