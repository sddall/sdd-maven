package com.sdd.service.impl;

import com.sdd.service.IUserService;

public class UserServiceImpl implements IUserService {

	@Override
	public void save() {
		System.out.println("�����û�");
	}

	@Override
	public void delete() {
		System.out.println("ɾ���û�");
		
	}

	@Override
	public void updata() {
		System.out.println("�޸��û�");
		
	}

	@Override
	public void select() {
		System.out.println("�����û�");		
	}

	
}
