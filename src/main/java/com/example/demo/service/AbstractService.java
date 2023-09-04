package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.AbstractModel;
import com.example.demo.model.Student;
import com.example.demo.repository.AbstractRepository;
import com.example.demo.service.Interface.IAbstractService;

public abstract class AbstractService <T extends AbstractModel, R extends AbstractRepository> implements IAbstractService<T> {
@Autowired 
R repository;
@Override
public List<T> findAll() {
	// TODO Auto-generated method stub
	return this.repository.findAll();
}
public T findBy(Long id)
{
Optional<T> t= this.repository.findById(id);
 if (t.isPresent())
	 return t.get();
 else 
 {return null;}
}
@Override
public void save(T entity) {
 this.repository.save(entity);
}
}
