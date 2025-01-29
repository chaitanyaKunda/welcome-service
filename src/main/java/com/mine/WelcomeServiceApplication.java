package com.mine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WelcomeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WelcomeServiceApplication.class, args);
	}

	@GetMapping("/")
	public String home(){
		return "Hello Chaitanya, welcome to docker deployment, deployment through docker images\n thisis latest version";
	}

	private int counter;

	@GetMapping("/count")
	public String welcomeCounter(){
		counter++;
		return String.format("welcome service counter: %d",counter);
	}

}
