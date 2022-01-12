package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class Jeenov22Application {

	public static void main(String[] args) {
		System.out.println(" i am printing from server side");
		SpringApplication.run(Jeenov22Application.class, args);
		
	}

}
