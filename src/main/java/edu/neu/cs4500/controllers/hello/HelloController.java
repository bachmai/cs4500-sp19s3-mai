package edu.neu.cs4500.controllers.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/api/hello/string")
	public String sayHello() {
		return "Hello CS 4500!";
	}
	@RequestMapping("/api/hello/object")
	public HelloObject sayHelloObject() {
		return new HelloObject("A HelloObject appears.");
	}
}
