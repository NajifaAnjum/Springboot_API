package com.example.tutorial_8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication                 //this annotation tells that this is the starting point of our springboot application
public class Tutorial8Application {

	public static void main(String[] args) {
		SpringApplication.run(Tutorial8Application.class, args);   //static class-telling to start the application
	}

}
