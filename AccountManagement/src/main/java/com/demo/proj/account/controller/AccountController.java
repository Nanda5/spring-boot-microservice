package com.demo.proj.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	@Autowired
	private Environment env;

	@GetMapping("/status/check")
	public String check() {
		return "Accoount-App - working on port" + env.getProperty("local.server.port");
	}
}
