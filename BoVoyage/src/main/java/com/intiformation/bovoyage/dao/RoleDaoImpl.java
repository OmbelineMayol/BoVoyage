package com.intiformation.bovoyage.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.intiformation.bovoyage.entity.Role;

@Repository
public class RoleDaoImpl implements IRoleDao {

	// création de la session factory d'hibernate
	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * setter de la session factory pour injection spring
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	// méthodes
	@Transactional
	public void addRoleDao(Role pRole) {
		// récupération de la session courante
		sessionFactory.getCurrentSession().save(pRole);
	}
	@Transactional(readOnly = true)
	public Role getByIdRoleDao(int pIdRole) {
		return (Role) sessionFactory.getCurrentSession().get(Role.class, pIdRole);
	}
	@Transactional
	public void updateRoleDao(Role pRole) {
		sessionFactory.getCurrentSession().update(pRole);

	}
	@Transactional
	public void deleteRoleDao(int pIdRole) {
		Role role = (Role) sessionFactory.getCurrentSession().get(Role.class, pIdRole);
		sessionFactory.getCurrentSession().delete(role);

	}
	@Transactional(readOnly = true)
	public List<Role> getAllRoles() {
		List<Role> listeRoleOut = sessionFactory.getCurrentSession().createQuery("FROM role").list();
		return listeRoleOut;
	}

}
