package com.example.ums.strategy;

import com.example.ums.entity.Course;
import java.util.List;

public interface CourseSortStrategy {
    List<Course> sort(List<Course> courses);
}
