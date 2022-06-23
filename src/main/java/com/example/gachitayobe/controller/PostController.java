package com.example.gachitayobe.controller;

import com.example.gachitayobe.service.PostSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PostController {
    @Autowired
    private PostSearchService postSearchService;

    @GetMapping("/test/kakao/coordinate")
    public ArrayList<Double> getPosts (@RequestParam String query){
        return postSearchService.getCoordinate(query);
    }
}
