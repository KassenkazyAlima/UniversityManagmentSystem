package com.example.ums.strategy;

import com.example.ums.entity.Course;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByDateStrategy implements CourseSortStrategy {
    @Override
    public List<Course> sort(List<Course> courses) {
        return courses.stream()
                .sorted(Comparator.comparing(Course::getStartDate))
                .collect(Collectors.toList());
    }
}
