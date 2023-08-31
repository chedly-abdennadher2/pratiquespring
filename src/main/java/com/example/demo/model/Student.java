package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)

public class Student implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
private String id;

private String firstName;
private String lastName;

}
