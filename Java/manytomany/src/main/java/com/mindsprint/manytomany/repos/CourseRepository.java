package com.mindsprint.manytomany.repos;

import com.mindsprint.manytomany.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
