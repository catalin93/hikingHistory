package com.example.demo.controller;

import com.example.demo.dto.HikingDTO;
import com.example.demo.service.HikingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
@Slf4j
@Controller
public class MainController {

    @Autowired
    private HikingService hikingService;

    @GetMapping("/addHiking")

    public String addHikingGet(Model model){
        HikingDTO hikingDTO = new HikingDTO();
        model.addAttribute("hikingDTO", hikingDTO);
        return "addHiking";
    }

    @PostMapping("/addHiking")
    public String addHikingPost(@ModelAttribute HikingDTO hikingDTO){
        return "redirect:/addHiking";
    }


}
