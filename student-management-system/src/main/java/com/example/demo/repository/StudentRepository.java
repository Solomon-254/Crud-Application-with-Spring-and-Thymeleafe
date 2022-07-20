package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Student;

//We extend our interface to the jpaRepository.
//The JPA repository accepts two generic types
    //1. The entity/model class name
    //2. The type ID of the entity the repository manages
public interface StudentRepository extends JpaRepository<Student, Long> {

	 
	
	
}
