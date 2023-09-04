package com.example.demo.service.Interface;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

public interface IAbstractService<T> {
public List<T> findAll();
public void save(T t);
public T findBy(@PathVariable Long id);

}
