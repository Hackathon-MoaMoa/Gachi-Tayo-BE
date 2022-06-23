package com.example.gachitayobe.service;

import com.example.gachitayobe.dto.PostDto;
import com.example.gachitayobe.dto.PostSearchDto;

import java.util.ArrayList;

public interface PostSearchService {
    ArrayList<Double> getCoordinate(String query);
    ArrayList<Double> getAllCoordinate(String start_address, String end_address);
    ArrayList<PostDto> getSearchedPosts(PostSearchDto postSearchDto);
<<<<<<< HEAD
}
=======

    }
>>>>>>> 858bf2eceda4f2bf1cf45e586f73e743a2bbd36f
