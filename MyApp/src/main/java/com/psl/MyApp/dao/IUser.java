package com.psl.MyApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psl.MyApp.entities.Users;

public interface IUser extends JpaRepository<Users,Integer>{

}
