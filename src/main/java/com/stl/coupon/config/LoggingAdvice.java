package com.stl.coupon.config;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.databind.ObjectMapper;

@Aspect
@Component
public class LoggingAdvice {
	
	private final static Logger LOGGER = Logger.getLogger(LoggingAdvice.class);
	
	@Pointcut(value = "execution (* com.stl.coupon.*.*.*(..))")
	public void pointCut() {		
	}
	
	@Around("pointCut()")
	public Object applicationLogger(ProceedingJoinPoint joinPoint) throws Throwable {
		ObjectMapper mapper = new ObjectMapper();
		String methodName = joinPoint.getSignature().getName();
		String className =  joinPoint.getTarget().getClass().toString();
		Object[] argsArr = joinPoint.getArgs();
		//Entry Request
		LOGGER.info("Method Invoked->"+className+"-: "+methodName+"()"+"arguments-: "+ mapper.writeValueAsString(argsArr));
		Object object = joinPoint.proceed();
		//Exit Response
		LOGGER.info("Exit->"+className+"-: "+methodName+"()"+"arguments-: "+ mapper.writeValueAsString(object));
		return object;
	}

}
