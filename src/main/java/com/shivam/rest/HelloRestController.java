package com.shivam.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	@Value("${yourname.firstname}")
	String firstName;
	
	@Value("${yourname.lastname}")
	String lastName;
	
	@Value("${yourname.age}")
	String age;
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello from Spring Boot";
	}
	
	@GetMapping("/workout")
	public String workout() {
		return "Do WORKOUT atlest 5 day a week!!!!";
	}
	
	@GetMapping("/yourname")
	public String yourName() {
		return "Data is "+firstName+" "+lastName+" - "+age;
	}
	
}
