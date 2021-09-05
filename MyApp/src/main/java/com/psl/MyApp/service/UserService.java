package com.psl.MyApp.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.psl.MyApp.dao.IUser;
import com.psl.MyApp.entities.Users;

@Component
public class UserService {
	
	@Autowired
	private IUser user;

	public void addUser(@Valid Users u) {
		// TODO Auto-generated method stub
		user.save(u);
	}

}
