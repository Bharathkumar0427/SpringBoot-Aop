package com.alienTechie.aopApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.alienTechie.aopApp.service.LoggingService;

import jakarta.annotation.PostConstruct;

@SpringBootApplication

public class AopAppApplication {
	
	@Autowired
	 public LoggingService loggingService;

	public static void main(String[] args) {
		SpringApplication.run(AopAppApplication.class, args);
		
	}
	
	@PostConstruct
	public void postcon() {
		
		this.loggingService.logBefore();
	}
	
	
	

}
