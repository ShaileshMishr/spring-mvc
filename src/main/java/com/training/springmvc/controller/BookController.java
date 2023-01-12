package com.training.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.training.springmvc.model.Book;
import com.training.springmvc.service.BookService;

@Controller
public class BookController {

	@Autowired
	BookService service;
	
	@RequestMapping(value="/addBook", method = RequestMethod.GET)
	public String add() {
	
		return "addBook";
		
	}
	

	@RequestMapping(value="/addBook", method = RequestMethod.POST)
	public String addBook(Model map, @ModelAttribute("book") Book book) {
	
		if(service.createBook(book)) {
			map.addAttribute("bookMsg", "Book Added Successfully");
			return "addBook";
		}
		else {
			map.addAttribute("bookMsg","Book Does Not Added!!! Try Again");
			return "addBook";
		}
		
		
	}
	
}
