package com.upgrad.ideaApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IdeaAppApplication {

	public static void main(String[] args) {

		System.out.println("Hello Students, this is our first spring project");

		SpringApplication.run(IdeaAppApplication.class, args);
	}

}
