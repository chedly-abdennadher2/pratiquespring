package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping ("/student")

public class StudentController implements AbstractController <Student>{
@Autowired
private StudentService service;
@GetMapping("/all") 
public List<Student> findAll()
{return service.findAll();
}
@GetMapping("/find/{id}") 

public Student findBy(@PathVariable String id)
{
	Student student= this.service.findBy(id);
	return student;
	
}
@PostMapping("/save/") 

public void save(@RequestBody Student student)
{ this.service.save(student);
}
}
