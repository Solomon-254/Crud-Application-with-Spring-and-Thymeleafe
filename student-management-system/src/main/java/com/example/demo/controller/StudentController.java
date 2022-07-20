package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

//We do this to make this class our controller used mainly in MVC applications
@Controller
public class StudentController {
//Implementing list students feature

	private StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}
	
	//The REST API starts from here
	
	//Handler method to handle student's list and return Model and View
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", service.getAllStudents());
		return "students" ;
		
	}
	
	@GetMapping("/students/new")
	public String craeteStudentForm(Model model) {
		//Here we are creating a student object to hold student data from the form
		Student student = new Student();
		model.addAttribute("student", student);
		return "create_student";
		
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		service.saveStudent(student);
		return "redirect:/students";
		
	}
	
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("student", service.getStudentById(id));
		return "edit_student";
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("student") Student student,
			Model model) {
		//get student by id from the database
		Student existingStudent= service.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		
		//save update Student object
		service.updateStudent(existingStudent);
		 
		return "redirect:/students";
		
	}
	
	//Handler method to delete the request
	@GetMapping("/students/{id}")
	public String deleteRecord(@PathVariable Long id) {
		service.deleteStudentById(id);
		
		return "redirect:/students";
		
	}
	
}
