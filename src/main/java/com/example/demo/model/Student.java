package com.example.demo.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)

public class Student extends AbstractModel {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


private String firstName;
private String lastName;
@ManyToOne (cascade=CascadeType.ALL,fetch=FetchType.EAGER)
private University university;
}
