package com.example.demo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HikingDTO {
    private String id;
    private String title;
    private String description;
    private String location;
    private String date;

    @ToString.Exclude
    private String img;
}
