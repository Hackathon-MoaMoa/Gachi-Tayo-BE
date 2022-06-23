package com.example.gachitayobe.service;

import com.example.gachitayobe.dto.PostDetailDto;
import com.example.gachitayobe.dto.PostDto;

public interface PostService {
    PostDetailDto getPostDetail(int p_id);
}
