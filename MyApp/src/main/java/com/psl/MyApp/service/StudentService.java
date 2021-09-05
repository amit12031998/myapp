package com.psl.MyApp.service;
import java.util.*;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.psl.MyApp.dao.IStudent;
import com.psl.MyApp.entities.Student;

@Component
public class StudentService {
	
	@Autowired
	private IStudent student;

	public void registerStudent(Student s) {
		// TODO Auto-generated method stub
		student.save(s);
		
	}

	public void updateStudent(@Valid Student s) {
		// TODO Auto-generated method stub
		student.save(s);
	}

	public Optional<Student> getStudent(int id) {
		// TODO Auto-generated method stub
		return student.findById(id);
	}

	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return student.findAll();
	}

}
