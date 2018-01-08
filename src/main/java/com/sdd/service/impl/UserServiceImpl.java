package com.sdd.service.impl;

import com.sdd.service.IUserService;

public class UserServiceImpl implements IUserService {

	@Override
	public void save() {
		System.out.println("保存用户");
	}

	@Override
	public void delete() {
		System.out.println("删除用户");
		
	}

	@Override
	public void updata() {
		System.out.println("修改用户");
		
	}

	@Override
	public void select() {
		System.out.println("查找用户");		
	}

	
}
