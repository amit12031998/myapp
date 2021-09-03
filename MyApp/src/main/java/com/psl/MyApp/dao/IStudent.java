package com.psl.MyApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psl.MyApp.entities.Student;

public interface IStudent extends JpaRepository<Student,Integer>{

}
