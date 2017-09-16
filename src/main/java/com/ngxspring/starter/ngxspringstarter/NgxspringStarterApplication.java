package com.ngxspring.starter.ngxspringstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ngxspring.starter.controller")
public class NgxspringStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(NgxspringStarterApplication.class, args);
	}
}
