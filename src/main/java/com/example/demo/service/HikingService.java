package com.example.demo.service;

import com.example.demo.dto.HikingDTO;
import com.example.demo.entities.Hiking;
import com.example.demo.mapper.HikingMapper;
import com.example.demo.repository.HikingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class HikingService {

    @Autowired
    private HikingRepository hikingRepository;

    @Autowired
    private HikingMapper hikingMapper;

    public void addHiking(HikingDTO hikingDTO, MultipartFile multipartFile){
        Hiking hiking = hikingMapper.hiking(hikingDTO, multipartFile);
        hikingRepository.save(hiking);
    }

}
