package com.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class jenkinscontroller {
	@GetMapping("/")
	public String hello() {
		return " welcome to jenkins";
	}

}
