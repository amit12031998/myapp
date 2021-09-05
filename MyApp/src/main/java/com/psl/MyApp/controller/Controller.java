package com.psl.MyApp.controller;

import java.util.*;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psl.MyApp.entities.Course;
import com.psl.MyApp.entities.Student;
import com.psl.MyApp.entities.Users;
import com.psl.MyApp.service.CourseService;
import com.psl.MyApp.service.StudentService;
import com.psl.MyApp.service.UserService;

@RestController
public class Controller {

	@Autowired
	private StudentService studentService;
	
	@Autowired
	private CourseService courseService;
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/registerstudent")
	public void registerStudent(@Valid @RequestBody Student s)
	{
		studentService.registerStudent(s);
	}
	
	@PutMapping("/updatestudent")
	public void updateStudent(@Valid @RequestBody Student s)
	{
		studentService.updateStudent(s);
	}
	
	@GetMapping("/student/{id}")
	public Optional<Student> getStudent(@PathVariable int id)
	{
		return studentService.getStudent(id);
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudent()
	{
		return studentService.getAllStudent();
	}
	
	@PostMapping("/addcourse")
	public void addCourse(@Valid @RequestBody Course c)
	{
		courseService.addCourse(c);
	}
	
	@PutMapping("/updatecourse")
	public void updateCourse(@Valid @RequestBody Course c)
	{
		courseService.updateCourse(c);
	}
	
	@GetMapping("/course")
	public List<Course> getCourse()
	{
		return courseService.getCourse();
	}
	
	@GetMapping("/deletecourse/{id}")
	public void deleteCourse(@PathVariable int id)
	{
		courseService.deleteCourse(id);
	}
	
	@PostMapping("/adduser")
	public void addUser(@Valid @RequestBody Users u)
	{
		userService.addUser(u);
	}
}

