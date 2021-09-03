package com.psl.MyApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psl.MyApp.entities.Course;


public interface ICourse extends JpaRepository<Course,Integer>{

}
