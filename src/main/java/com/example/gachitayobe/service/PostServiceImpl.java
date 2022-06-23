package com.example.gachitayobe.service;

import com.example.gachitayobe.dto.PostDetailDto;
import com.example.gachitayobe.dto.PostDto;
<<<<<<< HEAD
=======
import com.example.gachitayobe.dto.PostSearchDto;
>>>>>>> 858bf2eceda4f2bf1cf45e586f73e743a2bbd36f
import com.example.gachitayobe.mapper.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

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

    public List<PostDto> getAllPosts(){ return postMapper.getAllPosts(); }

<<<<<<< HEAD
    public void postWrite(@RequestBody PostDto postDto) {
        postMapper.postWrite(postDto);
    }
=======
>>>>>>> 858bf2eceda4f2bf1cf45e586f73e743a2bbd36f
}
