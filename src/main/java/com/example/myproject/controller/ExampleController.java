package com.example.myproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

	@GetMapping(value = "/home")
	public String getHello() {
		return "Welcome to Spring boot";
	}
}
