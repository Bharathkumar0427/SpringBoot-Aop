package com.alienTechie.aopApp.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alienTechie.aopApp.service.LoggingService;

@Service
public class LoggingServiceImpl implements LoggingService{
	
	public static final Logger logger=  LoggerFactory.getLogger(LoggingServiceImpl.class);

	@Override
	public void logBefore() {
		
		logger.info("LOGGING BEFORE");
	}

	@Override
	public void logAfter() {
		logger.info("LOGGING BEFORE");
	
		
	}

	@Override
	public void logAfterReturning() {
		logger.info("LOGGING AFTER RETURNING");
		
	}

	@Override
	public void logAfterThrowing() {
		logger.info("LOGGING AFTER THROWING");
	}

	@Override
	public void logAround() {
		logger.info("LOGGING  AROUND");
		
	}

}
