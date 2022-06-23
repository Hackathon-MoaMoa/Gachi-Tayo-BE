package com.example.gachitayobe.service;

import com.example.gachitayobe.dto.PostDetailDto;
import com.example.gachitayobe.dto.PostDto;
<<<<<<< HEAD
import com.example.gachitayobe.dto.UserRatingDto;
=======
import com.example.gachitayobe.dto.PostSearchDto;
>>>>>>> 858bf2eceda4f2bf1cf45e586f73e743a2bbd36f

import java.util.List;

public interface PostService {
    PostDetailDto getPostDetail(int p_id);
    List<Integer> getRemainSeat(int p_id);
    List<PostDto> getAllPosts();
<<<<<<< HEAD
    void postWrite(PostDto postDto);
=======

>>>>>>> 858bf2eceda4f2bf1cf45e586f73e743a2bbd36f
}
