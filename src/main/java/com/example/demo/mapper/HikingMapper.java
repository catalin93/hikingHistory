package com.example.demo.mapper;

import com.example.demo.dto.HikingDTO;
import com.example.demo.entities.Hiking;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.apache.tomcat.util.codec.binary.Base64;

import java.io.IOException;

@Component
public class HikingMapper {

    public Hiking hiking(HikingDTO hikingDTO, MultipartFile multipartFile){
        return Hiking.builder()
                .title(hikingDTO.getTitle())
                .date(hikingDTO.getDate())
                .description(hikingDTO.getDescription())
                .location(hikingDTO.getLocation())
                .img(convertToByte(multipartFile))
                .build();
    }

    private byte[] convertToByte(MultipartFile multipartFile){
        try {
            return multipartFile.getBytes();
        } catch (IOException e) {
            return new byte[0];
        }
    }


}
