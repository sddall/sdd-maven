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
	//ǰ��֪ͨ
	@Before("MyAdvice.pc()")
	public void before(){
		System.out.println("����ǰ��֪ͨ");
	}
	//�������쳣ʱ�ĺ���֪ͨ
	@AfterReturning("execution(* com.sdd.service.impl.UserServiceImpl.*(..))")
	public void afterReturning(){
		System.out.println("���Ǻ���֪ͨ(�������쳣)");
	}
	//�쳣����֪ͨ
	@AfterThrowing("execution(* com.sdd.service.impl.UserServiceImpl.*(..))")
	public void afterException(){
		System.out.println("�쳣֪ͨ");
	}
	//����֪ͨ
	public Object arround(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("����֪֮ͨǰ�Ĳ���");
		Object proceed = pjp.proceed();
		System.out.println("����֪֮ͨ��Ĳ���");
		return proceed;
	}
	//����֪ͨ,��������쳣Ҳ��ִ��
	public void after(){
		System.out.println("����֪ͨ");
	}
}
