package com.intiformation.bovoyage.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.intiformation.bovoyage.entity.Accompagnant;

@Repository
public class AccompagantDaoImpl implements IAccompagnantDao {

	// création de la session factory d'hibernate
	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * setter de la session factory pour injection de spring
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	// méthodes
	@Transactional
	public void addAccompagnantDao(Accompagnant pAccompagnant) {
		// récupération de la session courante
		sessionFactory.getCurrentSession().save(pAccompagnant);
	}

	@Transactional(readOnly = true)
	public Accompagnant getByIdAccompagnantDao(int pIdAccompagnant) {
		return (Accompagnant)sessionFactory.getCurrentSession().get(Accompagnant.class, pIdAccompagnant);
	}

	@Transactional
	public void updateAccompagnantDao(Accompagnant pAccompagnant) {
		sessionFactory.getCurrentSession().update(pAccompagnant);

	}

	@Transactional
	public void deleteAccompagnantDao(int pIdAccompagnant) {
		Accompagnant accompagnant = (Accompagnant)sessionFactory.getCurrentSession().get(Accompagnant.class, pIdAccompagnant);
		sessionFactory.getCurrentSession().delete(accompagnant);
	}

	@Transactional(readOnly = true)
	public List<Accompagnant> getAllAccompagnant() {
		List<Accompagnant> listeAccompagnantOut = sessionFactory.getCurrentSession().createQuery("FROM accompagnant ac").list();
		return listeAccompagnantOut;
	}

}
