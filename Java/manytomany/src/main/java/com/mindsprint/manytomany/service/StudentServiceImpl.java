package com.mindsprint.manytomany.service;

import com.mindsprint.manytomany.models.Course;
import com.mindsprint.manytomany.models.Student;
import com.mindsprint.manytomany.repos.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
    @Override
    public Student registerCourse(Long cid, Long sid) {
        Student student= studentRepository.findById(sid).orElse(null);
        if(student!=null){
            Course course= new Course();
            course.setId(cid);
           Set<Course> set =student.getCourses();
           set.add(course);
           student.setCourses(set);
            return studentRepository.save(student);
        }
        return  null;
    }

    @Override
    public Student login(String email, String password) {
        Student found= studentRepository.findByEmail(email);
        if(found!=null){
            if(found.getPassword().equals(password))
                return found;
        }
        return  null;
    }

    @Override
    public void makeAdmin(Long id) {
        Student found= studentRepository.findById(id).orElse(null);
        if(found!=null){
            found.setRole(true);
            studentRepository.save(found);
        }
    }

}
