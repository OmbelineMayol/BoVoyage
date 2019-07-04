package com.intiformation.bovoyage.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.intiformation.bovoyage.entity.Accompagnant;
import com.intiformation.bovoyage.entity.Client;

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
		return (Accompagnant) sessionFactory.getCurrentSession().get(Accompagnant.class, pIdAccompagnant);
	}

	@Transactional
	public void updateAccompagnantDao(Accompagnant pAccompagnant) {
		sessionFactory.getCurrentSession().update(pAccompagnant);

	}

	@Transactional
	public void deleteAccompagnantDao(int pIdAccompagnant) {
		Accompagnant accompagnant = (Accompagnant) sessionFactory.getCurrentSession().get(Accompagnant.class,
				pIdAccompagnant);
		sessionFactory.getCurrentSession().delete(accompagnant);
	}

	@Transactional(readOnly = true)
	public List<Accompagnant> getAllAccompagnant() {
		List<Accompagnant> listeAccompagnantOut = sessionFactory.getCurrentSession().createQuery("FROM accompagnant ac")
				.list();
		return listeAccompagnantOut;
	}

	@Transactional(readOnly = true)
	public List<Accompagnant> getAllAccompagnantByClient(Client clientIn) {

		// Recuperation de la session
		Session session = sessionFactory.getCurrentSession();

		// Creation de la requete HQL
		String reqHQL = "SELECT ac FROM accompagnant ac, client cl WHERE cl.idClient = ?1";

		// Creation de la requete
		Query query = session.createQuery(reqHQL);

		// Passage des paramètres

		query.setParameter(1, clientIn.getIdClient());

		// Envoi de la req et récuperation du résultat

		List<Accompagnant> listeOut = query.list();

		return listeOut;
	}

}
