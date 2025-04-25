package com.example.ums.mappers;

import com.example.ums.dto.EnrollmentDTO;
import com.example.ums.entity.Enrollment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EnrollmentMapper {

    @Mapping(source = "student.id", target = "studentId")
    @Mapping(source = "course.id", target = "courseId")
    EnrollmentDTO toDto(Enrollment enrollment);

    @Mapping(source = "studentId", target = "student.id")
    @Mapping(source = "courseId", target = "course.id")
    Enrollment toEntity(EnrollmentDTO dto);
}
