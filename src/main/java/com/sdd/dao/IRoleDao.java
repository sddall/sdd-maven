package com.sdd.dao;

import java.util.List;

import com.sdd.model.pojo.po.Role;

public interface IRoleDao {
	//增
    void save(Role role);

    //删除
    void delete(Integer id);

    //改
    void update(Role role);

    //查
    Role getById(Integer id);

    //查
    int getTotalCount();

    //查
    List<Role> getAll();

}
