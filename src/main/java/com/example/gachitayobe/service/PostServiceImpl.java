package com.example.gachitayobe.service;

import com.example.gachitayobe.dto.PostDetailDto;
import com.example.gachitayobe.mapper.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private final PostMapper postMapper;

    public PostServiceImpl(PostMapper postMapper){
        this.postMapper = postMapper;
    }

    public PostDetailDto getPostDetail(int p_id){
        return postMapper.getPostDetail(p_id);
    }

    public List<Integer> getRemainSeat(int p_id){
        return postMapper.getRemainSeat(p_id);
    }
}
