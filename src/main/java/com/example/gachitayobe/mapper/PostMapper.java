package com.example.gachitayobe.mapper;

import com.example.gachitayobe.dto.PostDetailDto;
import com.example.gachitayobe.dto.PostDto;
<<<<<<< HEAD
import com.example.gachitayobe.dto.PostXYDto;
import com.example.gachitayobe.service.PostSearchService;
=======
import com.example.gachitayobe.dto.PostSearchDto;
import com.example.gachitayobe.dto.PostXYDto;
>>>>>>> 858bf2eceda4f2bf1cf45e586f73e743a2bbd36f
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface PostMapper {
    public PostDetailDto getPostDetail(int p_id);
    public List<Integer> getRemainSeat(int p_id);
    List<PostDto> getAllPosts();
    ArrayList<PostDto> getSearchedPosts(PostXYDto postXYDto);
<<<<<<< HEAD
    public void postWrite(PostDto postDto);
=======

>>>>>>> 858bf2eceda4f2bf1cf45e586f73e743a2bbd36f
}
