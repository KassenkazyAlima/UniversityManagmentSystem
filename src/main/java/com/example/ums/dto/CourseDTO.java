package com.example.ums.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CourseDTO {
    private Long id;
    private String name;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
}
