package com.sdd.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.sdd.dao.IRoleDao;
import com.sdd.model.pojo.po.Role;

public class RoleDaoImpl extends JdbcDaoSupport implements IRoleDao {

	@Override
	public void save(Role role) {
		String sql="insert into role (rname,alias) value(?,?)";
		getJdbcTemplate().update(sql, role.getRname(),role.getAlias());
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Role role) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Role getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTotalCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Role> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
