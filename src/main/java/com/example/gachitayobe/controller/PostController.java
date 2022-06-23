package com.example.gachitayobe.controller;

import com.example.gachitayobe.dto.PostDto;
import com.example.gachitayobe.dto.PostSearchDto;
import com.example.gachitayobe.service.PostSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import com.example.gachitayobe.dto.PostDetailDto;
import com.example.gachitayobe.service.PostService;


import java.util.List;


@RestController
@CrossOrigin("*")
public class PostController {
    @Autowired
    private PostSearchService postSearchService;
    @Autowired
    private PostService postService;


    @GetMapping("/test/kakao/coordinate")
    public ArrayList<Double> getPosts (@RequestParam String query){
        return postSearchService.getCoordinate(query);
    }

    @GetMapping("/api/posts/{p_id}")
    public PostDetailDto getPostDetail(@PathVariable("p_id") int p_id){
        return postService.getPostDetail(p_id);
    }

    @GetMapping("/api/posts/seat/{p_id}")
    public List<Integer> getRemainSeat(@PathVariable("p_id") int p_id){
        return postService.getRemainSeat(p_id);
    }

    @GetMapping("api/posts")
    public List<PostDto> getPosts(PostSearchDto postSearchDto){
        if (postSearchDto.getStartAddress()==null && postSearchDto.getEndAddress()==null){
            return postService.getAllPosts();
        }
        else{
            return postSearchService.getSearchedPosts(postSearchDto);
        }

    }
}
