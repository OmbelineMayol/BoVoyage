package com.intiformation.bovoyage.dao;

import java.util.List;

import com.intiformation.bovoyage.entity.Role;

public interface IRoleDao {
	
	public void addRoleDao (Role pRole);
	
	public Role getByIdRoleDao (int pIdRole);
	
	public void updateRoleDao (Role pRole);
	
	public void deleteRoleDao (int pIdRole);
	
	public List<Role> getAllRoles();
	
	
	
	
}
