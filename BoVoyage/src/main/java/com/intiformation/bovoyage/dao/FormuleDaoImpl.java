package com.intiformation.bovoyage.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.intiformation.bovoyage.entity.Formule;
import com.intiformation.bovoyage.entity.Hotel;

@Repository
public class FormuleDaoImpl implements IFormuleDao {

	/* --------------- ASSOCATIOND UML EN JAVA --------------------- */
	@Autowired
	private SessionFactory sessionFactory;

	// Setter pour l'injection Srping

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/* --------------- REDEFINITION DES METHODE --------------------- */

	@Transactional(readOnly = true)
	public List<Formule> getAllFormuleDao() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("FROM formule").list();
	}

	@Transactional(readOnly = true)
	public List<Formule> getFormuleByPaysDao(String nomPays) {
		// 1. Recuperation de la session
		Session session = sessionFactory.getCurrentSession();

		// 2. Creation de la requeteHQL

		String reqHQL = "SELECT f FROM formule f WHERE f.pays=?1";

		// 3. Creation de la requete
		Query query = session.createQuery(reqHQL);

		// 4. Passage des paramètres dans la requete

		query.setParameter(1, nomPays);

		// 5. Envoi de la requete et recuperation du resultat

		List<Formule> listOut = query.list();

		return listOut;
	}

	@Transactional(readOnly = true)
	public List<Formule> getFormuleByContinentDao(String nomContinent) {

		// 1. Recuperation de la session
		Session session = sessionFactory.getCurrentSession();

		// 2. Creation de la requeteHQL

		String reqHQL = "SELECT f FROM formule f WHERE f.continent=?1";

		// 3. Creation de la requete
		Query query = session.createQuery(reqHQL);

		// 4. Passage des paramètres dans la requete

		query.setParameter(1, nomContinent);

		// 5. Envoi de la requete et recuperation du resultat

		List<Formule> listOut = query.list();

		return listOut;
	}

	@Transactional(readOnly = true)
	public Formule getFormuleById(int idFormule) {

		return (Formule) sessionFactory.getCurrentSession().get(Formule.class, idFormule);
	}

}
