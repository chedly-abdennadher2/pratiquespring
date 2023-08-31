package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.Interface.StudentServiceInterface;

@Service

public class StudentService implements StudentServiceInterface, AbstractService <Student>{
	@Autowired
	private StudentRepository repository;

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return this.repository.findAll();
	}
	public Student findBy(String id)
	{
	 return this.repository.findById(id).get();
	}
	@Override
	public void save(Student student) {
	 this.repository.save(student);
	}
}
