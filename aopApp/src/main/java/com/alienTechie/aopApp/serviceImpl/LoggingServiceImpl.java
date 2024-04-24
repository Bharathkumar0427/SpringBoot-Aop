package com.alienTechie.aopApp.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alienTechie.aopApp.service.LoggingService;

@Service
public class LoggingServiceImpl implements LoggingService{
	
	public static final Logger logger=  LoggerFactory.getLogger(LoggingServiceImpl.class);

	@Override
	public void logBeforeMethod() {
		
		logger.info("LOGGING BEFORE");
	}

	@Override
	public void logAfterMethod() {
		logger.info("LOGGING BEFORE");
	
		
	}

	@Override
	public String logAfterReturningMethod() {
		logger.info("LOGGING AFTER RETURNING");
		return "logAfterReturning";
		
	}

	@Override
	public void logAfterThrowingMethod() {
		logger.info("LOGGING AFTER THROWING");
	}

	@Override
	public void logAroundMethod() {
		logger.info("LOGGING  AROUND");
		
	}

}
