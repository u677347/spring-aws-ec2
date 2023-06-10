package com.example.springbootaws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerDemo {
	
	@RequestMapping(value="/hello")
	public String display() {
		return " Hello New Project";
	}

}
