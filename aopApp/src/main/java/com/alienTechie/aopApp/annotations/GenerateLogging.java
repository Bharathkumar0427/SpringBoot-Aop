package com.alienTechie.aopApp.annotations;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
@author Bharathkumar

This annotation is for logging purpose only

*/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface GenerateLogging {
	
	

}
