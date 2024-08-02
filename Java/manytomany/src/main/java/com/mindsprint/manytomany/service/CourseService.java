package com.mindsprint.manytomany.service;

import com.mindsprint.manytomany.models.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getAllCourses();
    public Course saveCourse(Course course);
    public Course updateCourse(Course course,Long id);
}
