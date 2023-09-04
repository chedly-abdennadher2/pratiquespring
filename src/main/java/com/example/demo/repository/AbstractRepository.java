package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import com.example.demo.model.AbstractModel;

@NoRepositoryBean

public interface AbstractRepository  <T extends AbstractModel, ID extends Long> extends JpaRepository<T, ID> {
	

}
