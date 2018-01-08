package com.sdd.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAdvice {
	@Pointcut("execution(* com.sdd.service.impl.UserServiceImpl.*(..))")
	public void pc(){
		
	}
	//前置通知
	@Before("MyAdvice.pc()")
	public void before(){
		System.out.println("这是前置通知");
	}
	//不出现异常时的后置通知
	@AfterReturning("execution(* com.sdd.service.impl.UserServiceImpl.*(..))")
	public void afterReturning(){
		System.out.println("这是后置通知(不出现异常)");
	}
	//异常拦截通知
	@AfterThrowing("execution(* com.sdd.service.impl.UserServiceImpl.*(..))")
	public void afterException(){
		System.out.println("异常通知");
	}
	//环绕通知
	public Object arround(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("环绕通知之前的部分");
		Object proceed = pjp.proceed();
		System.out.println("环绕通知之后的部分");
		return proceed;
	}
	//后置通知,就算出现异常也会执行
	public void after(){
		System.out.println("后置通知");
	}
}
