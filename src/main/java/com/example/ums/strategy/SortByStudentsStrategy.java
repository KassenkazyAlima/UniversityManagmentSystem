package com.example.ums.strategy;

import com.example.ums.entity.Course;
import com.example.ums.services.CourseService;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByStudentsStrategy implements CourseSortStrategy {
    @Override
    public List<Course> sort(List<Course> courses) {
        return courses.stream()
                .sorted(Comparator.comparingInt(c -> c.getEnrollments().size()))
                .collect(Collectors.toList());
    }
}
