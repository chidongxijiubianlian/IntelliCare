package com.andon.intellihouse.IntelliCare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class IntelliCareApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntelliCareApplication.class, args);
	}
}
