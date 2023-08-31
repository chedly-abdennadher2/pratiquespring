package com.example.demo.controller;

import java.util.List;

public interface AbstractController<T> {
public List<T> findAll();
public void save(T t);
}
