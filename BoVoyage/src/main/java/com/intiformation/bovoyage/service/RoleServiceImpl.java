package com.intiformation.bovoyage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiformation.bovoyage.entity.Role;

@Service
public class RoleServiceImpl implements IRoleService {

	// D�claration du DAO
	@Autowired
	private IRoleService roleService;

	/**
	 * setter du dao pour injection spring
	 */

	public void setRoleService(IRoleService roleService) {
		this.roleService = roleService;
	}

	// r�d�finition des m�thodes
	public void addRoleDao(Role pRole) {

	}

	public Role getByIdRoleDao(int pIdRole) {

		return null;
	}

	public void updateRoleDao(Role pRole) {

	}

	public void deleteRoleDao(int pIdRole) {

	}

	public List<Role> getAllRoles() {

		return null;
	}

}
