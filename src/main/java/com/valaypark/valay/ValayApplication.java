package com.valaypark.valay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ValayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValayApplication.class, args);
	}
@PostMapping ("/login")
public String login(@RequestBody LoginForm form){
	System.out.println(form);
	return "Hello"; 
}
}
