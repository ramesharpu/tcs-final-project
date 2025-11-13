package com.tcs.tcs_final_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TcsFinalProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TcsFinalProjectApplication.class, args);
	}

	
	@GetMapping("/")
	public String welcome() {
		return "<h1>Welcome to TCS Final Project Application</h1>";
	}
	
	@GetMapping("/about")
	public String aboutUs() {
		return "<h1>About TCS</h1>"
				+ "<h3>We deliver excellence and create value for customers and communities - everyday. "
				+ "With the best talent and the latest technology we help customers turn complexity into opportunities"
				+ " and create meaningful change.</h3>";
	}
}
