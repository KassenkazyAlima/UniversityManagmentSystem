package com.example.ums.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EnrollmentDTO {
    private Long id;
    private Long studentId;
    private Long courseId;
    private LocalDateTime enrollmentDate;
}
