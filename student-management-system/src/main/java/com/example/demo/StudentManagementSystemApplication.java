package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@SpringBootApplication(exclude = {UserDetailsServiceAutoConfiguration.class })
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository repository;


	public void run(String... args) throws Exception {
		
	/*	Student student1 = new Student("Solomon", "Festus", "Soloowfestus@gmail.com");
		repository.save(student1);
		
		Student student2 = new Student("Elizabeth", "Njeri", "Eliza@gmail.com");
		repository.save(student2);
		
		Student student3 = new Student("Penina", "Kathambi", "Nina@gmail.com");
		repository.save(student3);
		
		Student student4 = new Student("Lisa" ,"Monjiro" , "Lisa@gmail.com");
		repository.save(student4);*/
		
		

	}

}
