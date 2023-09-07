package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AbstractModel;
import com.example.demo.model.Student;
import com.example.demo.service.Interface.IAbstractService;

public class AbstractController <T extends AbstractModel,S extends IAbstractService<T>>{
@Autowired 
protected S service;

@GetMapping("/all") 


public List<T> findAll()
{return service.findAll();
}
@GetMapping("/find/{id}") 

public T findById(@PathVariable Long id)
{
	T entity= this.service.findById(id);
	return entity;

}

@PostMapping("/save/") 

public T save(@RequestBody T t)
{
T t2	=this.service.save(t);
return t2;
}

@DeleteMapping ("/delete/{id}") 

public T delete(@PathVariable Long id)
{
	T entity= this.service.findById(id);
	this.service.delete(entity);
	return entity;

}
}
