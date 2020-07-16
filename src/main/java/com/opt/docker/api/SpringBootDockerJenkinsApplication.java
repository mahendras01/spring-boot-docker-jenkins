package com.opt.docker.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerJenkinsApplication {
	
	@GetMapping("/sorc")
	public String home() {
		return "Welcome to AWS First deployent...!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerJenkinsApplication.class, args);
	}

}
