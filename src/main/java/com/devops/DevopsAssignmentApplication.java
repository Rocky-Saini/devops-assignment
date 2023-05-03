package com.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsAssignmentApplication.class, args);
	}
	
	@GetMapping("/")
	public String user() {
		return "Program run succesfuly";
	}

}
