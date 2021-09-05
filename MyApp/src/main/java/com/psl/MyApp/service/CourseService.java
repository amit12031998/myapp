package com.psl.MyApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.psl.MyApp.dao.ICourse;
import com.psl.MyApp.entities.Course;

@Component
public class CourseService {
	
	@Autowired
	private ICourse service;

	public void addCourse(Course c) {
		// TODO Auto-generated method stub
		service.save(c);
	}

	public void updateCourse(Course c) {
		// TODO Auto-generated method stub
		service.save(c);
	}

	public List<Course> getCourse() {
		// TODO Auto-generated method stub
		return service.findAll();
	}

	public void deleteCourse(int id) {
		// TODO Auto-generated method stub
		service.deleteById(id);
	}

}
