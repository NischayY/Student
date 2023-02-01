package com.example.student.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.student.entity.Student;

public interface StudentService {

	Student saveStudent(@RequestBody Student s);
	
	List<Student> getAllStudents();
}
