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
		System.out.println("方法触发了");
		Object invoke=method.invoke(target, args);
		System.out.println("执行完毕了");
		return invoke;
	}

}
