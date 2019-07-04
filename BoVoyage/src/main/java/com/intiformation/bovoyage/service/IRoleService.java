package com.intiformation.bovoyage.service;

import java.util.List;

import com.intiformation.bovoyage.entity.Role;

public interface IRoleService {

	public void addRoleDao(Role pRole);

	public Role getByIdRoleDao(int pIdRole);

	public void updateRoleDao(Role pRole);

	public void deleteRoleDao(int pIdRole);

	public List<Role> getAllRoles();
}
