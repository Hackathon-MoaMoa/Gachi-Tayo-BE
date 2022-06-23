package com.example.gachitayobe.service;

import com.example.gachitayobe.dto.PostDto;
import com.example.gachitayobe.dto.PostSearchDto;
import com.example.gachitayobe.dto.PostXYDto;
import com.example.gachitayobe.dto.kakao.KakaoResponseDto;
import com.example.gachitayobe.mapper.PostMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;


@Service
public class PostSearchServiceImpl implements PostSearchService {
    private final PostMapper postMapper;

    @Value("${kakao.api-key}")
    private String apiKey;

    public PostSearchServiceImpl(PostMapper postMapper) {
        this.postMapper = postMapper;
    }

    public ArrayList<Double> getCoordinate(String query) {
        HashMap<String, Object> map = new HashMap<>(); //결과를 담을 map

        try {
            String apiURL = "https://dapi.kakao.com/v2/local/search/address.json?query="
                    + URLEncoder.encode(query, "UTF-8");

            HttpResponse<JsonNode> response = Unirest.get(apiURL)
                    .header("Authorization", "KakaoAK "+ apiKey)
                    .asJson();

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
            KakaoResponseDto bodyJson = objectMapper.readValue(response.getBody().toString(), KakaoResponseDto.class);
            ArrayList<Double> coordinate=new ArrayList<>();
            coordinate.add(bodyJson.getDocuments().get(0).getX());
            coordinate.add(bodyJson.getDocuments().get(0).getY());
            return coordinate;

        }
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<Double> getAllCoordinate(String start_address, String end_address){
        ArrayList<Double> coordinate=new ArrayList<>();
        for(int i=0;i<2;i++){
            HashMap<String, Object> map = new HashMap<>(); //결과를 담을 map
            String query="";
            try {
                if(i==0)
                    query=start_address;
                else
                    query=end_address;
                String apiURL = "https://dapi.kakao.com/v2/local/search/address.json?query="
                        + URLEncoder.encode(query, "UTF-8");

                HttpResponse<JsonNode> response = Unirest.get(apiURL)
                        .header("Authorization", "KakaoAK "+ apiKey)
                        .asJson();

                ObjectMapper objectMapper = new ObjectMapper();
                objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
                KakaoResponseDto bodyJson = objectMapper.readValue(response.getBody().toString(), KakaoResponseDto.class);
                coordinate.add(bodyJson.getDocuments().get(0).getX());
                coordinate.add(bodyJson.getDocuments().get(0).getY());

            }
            catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (JsonMappingException e) {
                e.printStackTrace();
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }
        return coordinate;
    }
    public ArrayList<PostDto> getSearchedPosts(PostSearchDto postSearchDto){
        ArrayList<Double> coordinate=new ArrayList<>();
        coordinate=getAllCoordinate(postSearchDto.getStartAddress(),postSearchDto.getEndAddress());
        PostXYDto postXYDto = new PostXYDto();
        postXYDto.setStartX(coordinate.get(0));
        postXYDto.setStartY(coordinate.get(1));
        postXYDto.setEndX(coordinate.get(2));
        postXYDto.setEndY(coordinate.get(3));
        postXYDto.setRadius(postSearchDto.getRadius());
        System.out.println(postXYDto);
        return postMapper.getSearchedPosts(postXYDto);
    }

}

