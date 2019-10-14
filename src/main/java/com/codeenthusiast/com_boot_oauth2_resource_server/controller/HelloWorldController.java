package com.codeenthusiast.com_boot_oauth2_resource_server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/hello")
	public String helloWolrd() {
		return "Hello World!!!";
	}
}
