package com.training.springmvc.dao;

import java.util.List;


import com.training.springmvc.model.User;


public interface LoginDao {

	//public void insert(User user);
	
	List<User> getUsers();
	
	
}
