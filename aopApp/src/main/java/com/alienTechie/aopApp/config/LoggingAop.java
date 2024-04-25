package com.alienTechie.aopApp.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAop {

	public static final Logger logger = LoggerFactory.getLogger(LoggingAop.class);

	@Before("@annotation(com.alienTechie.aopApp.annotations.GenerateLogging)")
	public void logBefore(JoinPoint joinpoint) {
		logger.info("method execution started before:{}", joinpoint.getSignature().getName());
	}

	@After("@annotation(com.alienTechie.aopApp.annotations.GenerateLogging)")
	public void logAfter(JoinPoint joinpoint) {

		logger.info("method execution started after:{}", joinpoint.getSignature().getName());
	}

	@Around("@annotation(com.alienTechie.aopApp.annotations.CheckPerfomance)")
	public void logAround(ProceedingJoinPoint joinpoint) throws Throwable  {
		
		long startTime=System.currentTimeMillis();
		final Object result=joinpoint.proceed();
	
		long endTime=System.currentTimeMillis();
		logger.info("{}  took {} timetoComplete", joinpoint.getSignature().getName(),startTime-endTime);
		
	}

	@AfterReturning(value = "execution(* com.alienTechie.aopApp..*(..))")
	public void afterReturning(JoinPoint joinpoint) {
		logger.info("method execution started afterReturning: {}", joinpoint.getSignature().getName());
	}

	@AfterThrowing(value = "execution(* com.alienTechie.aopApp..*(..))")
	public void afterthrowing(JoinPoint joinpoint) {
		logger.info("method execution started afterThrowing: {}", joinpoint.getSignature().getName());
	}

}
