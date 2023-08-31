package com.example.demo.service.Interface;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentServiceInterface {
public List<Student> findAll();
public Student findBy(String id);

public void save(Student student);
}
