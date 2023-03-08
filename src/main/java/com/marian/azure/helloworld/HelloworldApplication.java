package com.marian.azure.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloworldApplication {

	@GetMapping("/hello")
	public String helloMessage() {
		return "Hello world Success!";
	}
	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

}
