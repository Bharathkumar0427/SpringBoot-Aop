package com.alienTechie.aopApp.service;

public interface LoggingService {
	
	void logBeforeMethod();
	
	void logAfterMethod();
	
	String logAfterReturningMethod();
	
	void logAfterThrowingMethod();
	
	void logAroundMethod();

}
