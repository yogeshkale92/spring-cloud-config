package com.ibm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.config.Configuration;

@RestController
public class EmployeeController {

	@Autowired
	private Configuration configuration;

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome " + configuration.getName() + "from city " + configuration.getCity();
	}

}
