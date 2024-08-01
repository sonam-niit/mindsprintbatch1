package com.mindsprint.manytomany.models;


import jakarta.persistence.*;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.util.HashSet;
import java.util.Set;

@Entity
public class  Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    @Column(columnDefinition = "BOOLEAN DEFAULT false")
    private boolean role;

    @ManyToMany
    @JoinTable(
      name = "student_course", 
      joinColumns = @JoinColumn(name = "student_id"), 
      inverseJoinColumns = @JoinColumn(name = "course_id"))
    private Set<Course> courses = new HashSet<>();

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isRole() {
        return role;
    }

    public void setRole(boolean role) {
        this.role = role;
    }
}
