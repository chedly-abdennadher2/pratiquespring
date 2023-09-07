package com.example.demo.service.Interface;

import java.util.List;


public interface IAbstractService<T> {
public List<T> findAll();
public T save(T t);
public T findById( Long id);
public T delete (T entity);
}
