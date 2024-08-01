package com.mindsprint.manytomany.controllers;

import com.mindsprint.manytomany.models.Course;
import com.mindsprint.manytomany.models.Student;
import com.mindsprint.manytomany.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:3000/")
@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        return new ResponseEntity<>(studentService.saveStudent(student),HttpStatus.CREATED);
    }
    @PostMapping("{sid}/addCourse/{cid}")
    public  String addCourse(@PathVariable Long sid,@PathVariable Long cid){

        Student student= studentService.registerCourse(cid,sid);
        if(student!=null){
            return "Course Registered";
        }else{
            return "Error While Registering Course";
        }
    }
    @PostMapping("/login")
    public ResponseEntity<Object> login(@RequestBody Student student){
        Student found= studentService.login(student.getEmail(),student.getPassword());
        if(found!=null)
            return  new ResponseEntity<>(found, HttpStatus.OK);
        return  new ResponseEntity<>("Invalid Credentials",HttpStatus.NOT_FOUND);
    }
    @GetMapping("/makeadmin/{id}")
    public ResponseEntity<String> makeAdmin(@PathVariable Long id){
        studentService.makeAdmin(id);
        return new ResponseEntity<>("Role Updated",HttpStatus.OK);
    }
}
