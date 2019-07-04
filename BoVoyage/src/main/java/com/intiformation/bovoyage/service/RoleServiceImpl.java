package com.intiformation.bovoyage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiformation.bovoyage.dao.IRoleDao;
import com.intiformation.bovoyage.entity.Role;

@Service
public class RoleServiceImpl implements IRoleService {

	// D�claration du DAO
	@Autowired
	private IRoleDao roleDao;

	/**
	 * setter du dao pour injection spring
	 */

	public void setRoleDao(IRoleDao roleDao) {
		this.roleDao = roleDao;
	}

	// r�d�finition des m�thodes
	public void addRoleService(Role pRole) {
		roleDao.addRoleDao(pRole);
		
	}

	public Role getByIdRoleService(int pIdRole) {
		return roleDao.getByIdRoleDao(pIdRole);
	}

	public void updateRoleService(Role pRole) {
		roleDao.updateRoleDao(pRole);
		
	}

	public void deleteRoleService(int pIdRole) {
		roleDao.deleteRoleDao(pIdRole);
		
	}

	public List<Role> getAllRoles() {
		
		return roleDao.getAllRoles();
	}

}
