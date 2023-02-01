package com.example.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.entity.Student;
import com.example.student.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService stuServ;
	@PostMapping("/saveStudent")
	public ResponseEntity<Student> saveStudent(@RequestBody Student s){
		return new ResponseEntity<>(s,HttpStatus.OK); 
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<Student>> getAllStudents(){
		List<Student> list=stuServ.getAllStudents();
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
}
