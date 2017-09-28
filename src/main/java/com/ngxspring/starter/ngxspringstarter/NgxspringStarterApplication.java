package com.ngxspring.starter.ngxspringstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ngxspring.starter.controller", "com.ngxspring.starter.service"})
@Import({
		MongoConfig.class
})
@EnableMongoRepositories(basePackages = {"com.ngxspring.starter.models"})
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
