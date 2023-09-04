package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.Interface.IAbstractService;
import com.example.demo.service.Interface.IStudentService;

@Service

public class StudentService extends AbstractService<Student,StudentRepository> implements IStudentService {


}
