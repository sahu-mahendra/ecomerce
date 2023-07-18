package com.project.first.learing.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	
	@GetMapping("/home/{username}")
	public String home(@PathVariable("username")String username) {
		return username+ " is accessing spring boot";
	}
	
	
	
}
