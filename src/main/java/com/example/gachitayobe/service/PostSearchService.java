package com.example.gachitayobe.service;

import com.example.gachitayobe.dto.PostDto;
import com.example.gachitayobe.dto.PostSearchDto;

import java.util.ArrayList;

public interface PostSearchService {
    ArrayList<Double> getCoordinate(String query);
    ArrayList<Double> getAllCoordinate(String start_address, String end_address);
    ArrayList<PostDto> getSearchedPosts(PostSearchDto postSearchDto);
    ArrayList<PostDto> getLonLat(PostSearchDto postSearchDto);
}