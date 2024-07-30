package com.authex.authex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AuthExApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthExApplication.class, args);
	}


}
