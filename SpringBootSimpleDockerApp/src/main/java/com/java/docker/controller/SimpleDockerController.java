package com.java.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.docker.model.Student;

@RestController
public class SimpleDockerController {
	
	@GetMapping("/student")
	public String getStudentDetails() {
		
		Student s1 = new Student();
		
		s1.setsId(1);
		s1.setsName("Rahul Ranjan");
		s1.setRollNo(33);
		
		return s1.toString();
	}
}
