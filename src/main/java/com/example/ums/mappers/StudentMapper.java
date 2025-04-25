package com.example.ums.mappers;

import com.example.ums.dto.StudentDTO;
import com.example.ums.entity.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    StudentDTO toDto(Student student);
    Student toEntity(StudentDTO dto);
}
