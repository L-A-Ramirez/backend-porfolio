package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class PorfolioApplication {
	public static void main(String[] args) {
		SpringApplication.run(PorfolioApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedOrigins("https://porfolio-project-1f13a.web.app")
						.allowedMethods("GET", "POST", "PUT", "DELETE")
						.allowedHeaders("Origin","Content-type","Accept","Authorization","Access-Control-Allow-Origin")
						.exposedHeaders("Origin","Content-type","Accept","Authorization","Access-Control-Allow-Origin")
						.allowCredentials(true)
						.maxAge(3600);
			}
		};
	}

}