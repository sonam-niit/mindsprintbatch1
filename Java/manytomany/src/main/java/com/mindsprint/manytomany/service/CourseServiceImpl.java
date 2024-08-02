package com.mindsprint.manytomany.service;

import com.mindsprint.manytomany.models.Course;
import com.mindsprint.manytomany.repos.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }
    @Override
    public Course updateCourse(Course course, Long id) {
        Course oldCourse= courseRepository.findById(id).orElse(null);
        if(oldCourse!=null){
            oldCourse.setTitle(course.getTitle());
            return courseRepository.save(oldCourse);
        }
        return  null;
    }

}