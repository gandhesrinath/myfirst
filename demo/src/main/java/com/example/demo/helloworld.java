package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class helloworld {
	
	@RequestMapping("/hello")
	public String  hello() {
	
		return "Hello world 12 from STS ";
	}

}
