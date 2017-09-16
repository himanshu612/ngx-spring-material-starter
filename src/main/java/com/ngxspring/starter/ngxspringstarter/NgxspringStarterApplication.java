package com.ngxspring.starter.ngxspringstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@ComponentScan("com.ngxspring.starter.controller")
public class NgxspringStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(NgxspringStarterApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer(Environment env) {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				String[] profiles = env.getActiveProfiles();
				for(String profile : profiles){
					if(profile.equals("development")){
						registry.addMapping("/*").allowedOrigins("*");
					}
				}
			}
		};
	}
}
