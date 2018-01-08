package com.sdd.invocation;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.InvocationHandler;

public class PerformHandler implements InvocationHandler {
	private Object target;
	

	public PerformHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("����������");
		Object invoke=method.invoke(target, args);
		System.out.println("ִ�������");
		return invoke;
	}

}
