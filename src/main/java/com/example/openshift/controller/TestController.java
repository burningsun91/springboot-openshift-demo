package com.example.openshift.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/openshift/demo")
	public String helloOpenShift() {
		return "Welcome to Openshift";
	}

}
