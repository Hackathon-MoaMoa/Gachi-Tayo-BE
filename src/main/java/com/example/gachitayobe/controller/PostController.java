package com.example.gachitayobe.controller;

import com.example.gachitayobe.dto.PostDetailDto;
import com.example.gachitayobe.dto.PostSearchDto;
import com.example.gachitayobe.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping("/api/posts")
    public void getPosts (@RequestParam PostSearchDto postSearchDto){

    }

    @GetMapping("/api/posts/{p_id}")
    public PostDetailDto getPostDetail(@PathVariable("p_id") int p_id){
        return postService.getPostDetail(p_id);
    }
}
