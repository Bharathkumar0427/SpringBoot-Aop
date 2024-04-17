package com.alienTechie.aopApp.service;

public interface LoggingService {
	
	void logBefore();
	
	void logAfter();
	
	void logAfterReturning();
	
	void logAfterThrowing();
	
	void logAround();

}
