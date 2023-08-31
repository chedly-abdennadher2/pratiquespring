package com.example.demo.service;

import java.util.List;

public interface AbstractService<T> {
public List<T> findAll();
public void save(T t);
}
