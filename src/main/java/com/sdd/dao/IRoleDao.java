package com.sdd.dao;

import java.util.List;

import com.sdd.model.pojo.po.Role;

public interface IRoleDao {
	//��
    void save(Role role);

    //ɾ��
    void delete(Integer id);

    //��
    void update(Role role);

    //��
    Role getById(Integer id);

    //��
    int getTotalCount();

    //��
    List<Role> getAll();

}
