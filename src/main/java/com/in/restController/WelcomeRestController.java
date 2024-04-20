package com.in.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	//http://IP:9090
	@GetMapping
	public String welcomeMessage() {
		return "Welcome to Sankar";
	}

}
