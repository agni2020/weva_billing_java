package com.weva.ai.billing.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
//import org.aspectj.lang.reflect.MemberSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
//@Configuration
//@EnableAspectJAutoProxy
public class AspectConfiguration {



//	@Pointcut("execution(* com.weva.ai.billing.controller.SubscriptionPlanController.getAllPlans(..))")
//	public void loggingPointCut() {}

	@Before("execution(* com.weva.ai.billing..*.*(..))")
	public void before(JoinPoint joinPoint) {
		Logger logger = LoggerFactory.getLogger(joinPoint.getSignature().getDeclaringTypeName());
		logger.info("Started :: " + joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());
		for (int i = 0; i < joinPoint.getArgs().length; i++) {
			logger.info("\t------> Argument "+(i)+": " + joinPoint.getArgs()[i].toString() );
		}
	}

	@AfterReturning(value = "execution(* com.weva.ai.billing..*.*(..))",returning = "returnValue")
	public void normalClosing(JoinPoint joinPoint, Object returnValue) {
		Logger logger = LoggerFactory.getLogger(joinPoint.getSignature().getDeclaringTypeName());
		logger.info("Ended :: " + joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName() );
		logger.info("\t<------ Returned: " + returnValue.toString());

	}

//	@AfterThrowing(pointcut = "execution(* com.weva.ai.billing..*.*(..))", throwing = "exception")
	public void afterThrowing(JoinPoint joinPoint, Throwable exception) throws Throwable {
		Logger logger = LoggerFactory.getLogger(joinPoint.getSignature().getDeclaringTypeName());
		logger.error("Error occurred at " + joinPoint.getSignature() + "\n" + exception.getMessage());

	}

//	@Around("execution(* com.weva.ai.billing..*(..))))")
//	public Object executionTime(ProceedingJoinPoint point) throws Throwable {
//		Logger logger = LoggerFactory.getLogger(point.getSignature().getDeclaringTypeName());
//		long startTime = System.currentTimeMillis();
//		Object object = point.proceed();
//		long endtime = System.currentTimeMillis();
//		logger.info("Perf :: {\"className\":\"" + point.getSignature().getDeclaringTypeName() + "\",\"methodName\":\" "
//				+ point.getSignature().getName() + " \",\"timeInMillis\":\" " + (endtime - startTime) + "\"}");
//		return object;
//	}
}