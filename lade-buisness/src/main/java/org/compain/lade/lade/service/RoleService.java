package org.compain.lade.lade.service;

import java.util.List;

import org.compain.lade.lade.dao.RoleDao;
import org.compain.lade.lade.entities.Role;



public class RoleService {
	
	private static RoleService instance = new RoleService();

	private RoleDao roleDao = RoleDao.getInstance();

	private RoleService() {

	}

	public static RoleService getInstance() {
		return instance;
	}

	public List<Role> findAll() {
		return roleDao.findAll();
	}
	
	public Role getRole(Integer code) {
		return roleDao.getRole(code);
	}

	public void addSpot(Role role) {
		roleDao.saveOrUpdateRole(role);
	}



}
