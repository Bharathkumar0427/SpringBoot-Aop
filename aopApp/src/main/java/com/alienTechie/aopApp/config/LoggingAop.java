package com.alienTechie.aopApp.config;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class LoggingAop {
	
	public static final Logger logger=  LoggerFactory.getLogger(LoggingAop.class);
	
	@Before(value = "execution(* com.alienTechie.aopApp..*(..))")
	public void logBefore(JoinPoint joinpoint) {
		logger.info("method execution started before: "+joinpoint.getSignature().getName());
	}
	
	@After(value = "execution(* com.alienTechie.aopApp..*(..))")
	public void logAfter(JoinPoint joinpoint) {
		logger.info("method execution started after: "+joinpoint.getSignature().getName());
	}
	
	@Around(value = "execution(* com.alienTechie.aopApp..*(..))")
	public void logAround(JoinPoint joinpoint) {
		logger.info("method execution started around: "+joinpoint.getSignature().getName());
	}

}
