package com.example.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.entity.Student;
import com.example.student.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository stuRepo;
	@Override
	public Student saveStudent(Student s) {
		return stuRepo.save(s);
	}

	@Override
	public List<Student> getAllStudents() {
		return stuRepo.findAll();
	}
	
	
	
}
