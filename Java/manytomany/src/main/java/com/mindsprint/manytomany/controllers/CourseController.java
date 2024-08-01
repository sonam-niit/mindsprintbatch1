package com.mindsprint.manytomany.controllers;

import com.mindsprint.manytomany.models.Course;
import com.mindsprint.manytomany.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;
    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }
    @PostMapping
    public Course createCourse(@RequestBody Course course) {
        return courseService.saveCourse(course);
    }
}
