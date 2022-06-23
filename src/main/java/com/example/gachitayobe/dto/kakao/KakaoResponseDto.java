package com.example.gachitayobe.dto.kakao;

import lombok.Data;

import java.util.HashMap;
import java.util.List;

@Data
public class KakaoResponseDto {
    private HashMap<String, Object> meta;
    private List<KakaoDto> documents;
}

