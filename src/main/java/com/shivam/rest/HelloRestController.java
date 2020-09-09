package com.shivam.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	@GetMapping("/")
	public String sayHello() {
		return "Hello from Spring Boot";
	}
	
	@GetMapping("/workout")
	public String workout() {
		return "Do WORKOUT atlest 5 day a week!!!!";
	}
	
}
