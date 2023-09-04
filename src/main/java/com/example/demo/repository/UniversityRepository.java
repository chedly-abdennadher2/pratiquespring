package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Student;
import com.example.demo.model.University;
@RepositoryRestResource

public interface UniversityRepository extends AbstractRepository <University,Long>{

}
