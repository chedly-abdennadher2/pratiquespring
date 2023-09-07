package com.example.demo.service.Interface;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

public interface IAbstractService<T> {
public List<T> findAll();
public T save(T t);
public T findById(@PathVariable Long id);

}
