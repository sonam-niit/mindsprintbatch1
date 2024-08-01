package com.mindsprint.manytomany.repos;


import com.mindsprint.manytomany.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    public Student findByEmail(String email);
}
