package com.intiformation.bovoyage.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.intiformation.bovoyage.entity.Voiture;

@Repository
public class VoitureDaoImpl implements IVoitureDao {

	// création de la session factory d'hibernate
	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * setter de la session factory pour injection spring
	 */

	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	//méthodes
	@Transactional(readOnly = true)
	public Voiture getByIdVoitureDao(int pIdVoiture) {

		return (Voiture) sessionFactory.getCurrentSession().get(Voiture.class, pIdVoiture);
	}

	@Transactional(readOnly = true)
	public List<Voiture> getAllVoitures() {
		List<Voiture> listeVoitureOut = sessionFactory.getCurrentSession().createQuery("FROM voiture").list();
		return listeVoitureOut;
	}

}
