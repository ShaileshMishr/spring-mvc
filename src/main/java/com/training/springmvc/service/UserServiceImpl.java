package com.training.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springmvc.dao.LoginDao;
import com.training.springmvc.dao.LoginDaoImpl;
import com.training.springmvc.model.User;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	LoginDao dao;
	
	public boolean isValidUser(String userName, String password) {
		LoginDao dao = new LoginDaoImpl();
		boolean isValid1 = false;
		List<User> userList = dao.getUsers();
		
		for (User user : userList) {
			if (user.getUserName().equalsIgnoreCase(userName) && user.getPassword().equals(password)) {
				isValid1 = true;
			}
		}
		return isValid1;
	}
}
