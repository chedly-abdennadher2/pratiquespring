package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.AbstractModel;
import com.example.demo.model.Student;
import com.example.demo.service.Interface.IAbstractService;

public class AbstractController <T extends AbstractModel,S extends IAbstractService<T>>{
@Autowired 
protected S service;

@GetMapping("/all") 
@CrossOrigin(origins="http://localhost:4200")

public List<T> findAll()
{return service.findAll();
}
@GetMapping("/find/{id}") 
public T findBy(@PathVariable Long id)
{
	T entity= this.service.findBy(id);
	return entity;

}
@PostMapping("/save/") 

public void save(@RequestBody T t)
{
	this.service.save(t);

}
}
