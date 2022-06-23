package com.example.gachitayobe.dto;

import lombok.Data;
<<<<<<< HEAD
import lombok.Getter;
=======
>>>>>>> 858bf2eceda4f2bf1cf45e586f73e743a2bbd36f


<<<<<<< HEAD
=======

>>>>>>> 858bf2eceda4f2bf1cf45e586f73e743a2bbd36f
@Data
public class PostSearchDto {
    private String startAddress;
    private String endAddress;
    private int radius;

    @Override
    public String toString() {
        return "PostSearchDto{" +
                "startAddress='" + startAddress + '\'' +
                ", endAddress='" + endAddress + '\'' +
                ", radius=" + radius +
                '}';
    }
}
