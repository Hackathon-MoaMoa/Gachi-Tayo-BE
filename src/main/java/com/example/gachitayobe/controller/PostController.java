package com.example.gachitayobe.controller;

import com.example.gachitayobe.dto.PostSearchDto;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {
    @GetMapping("/api/posts")
    public void getPosts (@RequestParam PostSearchDto postSearchDto){

    }
}
