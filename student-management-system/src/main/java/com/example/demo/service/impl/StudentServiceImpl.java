package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository repository;
	
	
	public StudentServiceImpl(StudentRepository repository) {
		super();
		this.repository = repository;
	}


	public List<Student> getAllStudents() {
		return repository.findAll();
		}


	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return repository.save(student);
	}


	public Student getStudentById(Long id) {
		 
		return repository.findById(id).get();
	}


	public Student updateStudent(Student student) {
		 
		return repository.save(student)  ;
	}


	public void deleteStudentById(Long id) {
	   repository.deleteById(id);
		
	}

}
