package com.example.ums.mappers;

import com.example.ums.dto.CourseDTO;
import com.example.ums.entity.Course;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CourseMapper {
    @Mapping(target = "name", ignore = true)
    Course toEntity(CourseDTO dto);

    @Mapping(target = "name", ignore = true)
    CourseDTO toDto(Course course);
}
