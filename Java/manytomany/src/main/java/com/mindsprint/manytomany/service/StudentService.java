package com.mindsprint.manytomany.service;

import com.mindsprint.manytomany.models.Course;
import com.mindsprint.manytomany.models.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudents();
    public Student saveStudent(Student student);
    public Student registerCourse(Long cid,Long sid);
    public Student login(String email,String password);
    public void makeAdmin(Long id);
}
