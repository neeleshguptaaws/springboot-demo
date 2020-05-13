package com.neel.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@RequestMapping("/")
    public String index(){
		return "Hello World!";
	}
	
	@RequestMapping("/employee/{name}")
	public String getEmployeeByID(@PathVariable("name") String name) {
		return "Hello "+name;
	}

}
