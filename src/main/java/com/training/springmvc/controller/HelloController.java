package com.training.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.training.springmvc.dao.InsertData;
import com.training.springmvc.dao.LoginDao;
import com.training.springmvc.model.User;
import com.training.springmvc.service.RegisterServiceImpl;
import com.training.springmvc.service.UserService;
import com.training.springmvc.service.UserServiceImpl;

@Controller
@RequestMapping("/")
//@RequestMapping("/home")

public class HelloController {

	@Autowired
	UserService service;
	@Autowired
	LoginDao dao;
	@Autowired
	InsertData register;
	
	//@RequestMapping(value="/home" ,method=RequestMethod.POST )
	//@RequestMapping(method=RequestMethod.GET)
	//public String printGreet(ModelMap map, HttpServletRequest req) {
//		public String printGreet(ModelMap map, @ModelAttribute("userName") User user) {
//		map.addAttribute("msg","This value is set using ModelMap..");
//		
//		if(user.getUserName().equalsIgnoreCase("Shailesh") && user.getPassword().equalsIgnoreCase("123")) {
//			return "home";
//		}
//		else {
//			map.addAttribute("fail","Incorrect Credentials");
//			return "login";
//		}
		
		
//		String user=req.getParameter("userName");
//		String pwd =req.getParameter("password");
//		if(user.equals("Shailesh") && pwd.equals("123")) {
//			return "home";
//		}
//		else {
//			return "error";
//		}
		
		
		//return "home";
		
	//}
	@RequestMapping(value="/home" ,method=RequestMethod.GET )
	public String printGreet(ModelMap map,@ModelAttribute("user") User user) {
		
		if(service.isValidUser(user.getUserName(), user.getPassword())) {

		//	List<User> userList1 = dao.getUsers();
			return "success";


		}
		

		else {
			map.addAttribute("msg","Please enter correct username");
			return "error";
		}
		
		
	}
	
	
	
	@RequestMapping(value="/register" ,method=RequestMethod.GET)
	public String register(ModelMap map, @ModelAttribute("user") User user1) {
		
		map.addAttribute("success","SuccessFully Register");
		register.setUsers(user1.getUserName(), user1.getPassword());
		return "login";
	}
	
	
	@RequestMapping(method=RequestMethod.GET)
	public String homePage() {
		
		return "register";
	}
	
	
}
