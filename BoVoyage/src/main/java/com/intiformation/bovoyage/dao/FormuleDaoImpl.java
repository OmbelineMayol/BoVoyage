package com.intiformation.bovoyage.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.intiformation.bovoyage.entity.Formule;

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

	/**
	 * Récupère l'ensemble des formules
	 */
	
	@Transactional(readOnly = true)
	public List<Formule> getAllFormuleDao() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("SELECT f FROM formule f").list();
	}

	/**
	 * récupère l'ensemble des formules en fonction du Pays
	 */
	@Transactional(readOnly = true)
	public List<Formule> getFormuleByPaysDao(String nomPays) {
		// 1. Recuperation de la session
		Session session = sessionFactory.getCurrentSession();

		// 2. Creation de la requeteHQL

		String reqHQL = "SELECT f FROM formule f WHERE f.pays = ?";

		// 3. Creation de la requete
		Query query = session.createQuery(reqHQL);

		// 4. Passage des paramètres dans la requete

		query.setParameter(0, nomPays);

		// 5. Envoi de la requete et recuperation du resultat

		List<Formule> listOut = query.list();

		return listOut;
	}

	/**
	 * Récupère les formules en fonction du nom des continents
	 */
	
	@Transactional(readOnly = true)
	public List<Formule> getFormuleByContinentDao(String nomContinent) {

		// 1. Recuperation de la session
		Session session = sessionFactory.getCurrentSession();

		// 2. Creation de la requeteHQL

		String reqHQL = "SELECT f FROM formule f WHERE f.continent=?";

		// 3. Creation de la requete
		Query query = session.createQuery(reqHQL);

		// 4. Passage des paramètres dans la requete

		query.setParameter(0, nomContinent);

		// 5. Envoi de la requete et recuperation du resultat

		List<Formule> listOut = query.list();

		return listOut;
	}

	/**
	 * Récupère un formule par son id
	 */
	@Transactional(readOnly = true)
	public Formule getFormuleById(int idFormule) {

		return (Formule) sessionFactory.getCurrentSession().get(Formule.class, idFormule);
	}

	/**
	 * Methode qui permet de MAJ une formule
	 */
	@Transactional
	public void updateFormuleDao(Formule formule) {
		sessionFactory.getCurrentSession().update(formule);
		
	}

}
