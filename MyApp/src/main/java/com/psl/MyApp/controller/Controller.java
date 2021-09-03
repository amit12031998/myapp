package com.psl.MyApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psl.MyApp.service.CourseService;
import com.psl.MyApp.service.StudentService;

@RestController
public class Controller {

	@Autowired
	private StudentService studentService;
	
	@Autowired
	private CourseService courseService;
	
	
}
