package com.intiformation.bovoyage.service;

import java.util.List;

import com.intiformation.bovoyage.entity.Role;

public interface IRoleService {

	public void addRoleService(Role pRole);

	public Role getByIdRoleService(int pIdRole);

	public void updateRoleService(Role pRole);

	public void deleteRoleService(int pIdRole);

	public List<Role> getAllRoles();
}
