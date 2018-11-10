package com.atk.helloworld.conroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicController {
	
	@GetMapping("/")
	public String getMessage() {
		return "Hello Guys";
	}

}
