package com.intiformation.bovoyage.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.intiformation.bovoyage.entity.Accompagnant;

public class AccompagantDaoImpl implements IAccompagnantDao {

	// cr�ation de la session factory d'hibernate
	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * setter de la session factory pour injection de spring
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	// m�thodes
	@Transactional
	public void addAccompagnantDao(Accompagnant pAccompagnant) {
		// r�cup�ration de la session courante
		sessionFactory.getCurrentSession().save(pAccompagnant);
	}

	@Transactional
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

	@Transactional
	public List<Accompagnant> getAllAccompagnant() {
		List<Accompagnant> listeAccompagnantOut = sessionFactory.getCurrentSession().createQuery("FROM accompagnant ac").list();
		return listeAccompagnantOut;
	}

}
