package com.intiformation.bovoyage.dao;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.intiformation.bovoyage.entity.Banque;

@Repository
public class BanqueDaoImpl implements IBanqueDao{

	//Session factory d'hibernate
	@Autowired
	private SessionFactory sessionFactory;
	
	//setter de la session factory pour injection de spring
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	//redéfinition des méthodes
	@Transactional(readOnly = true)
	public Banque getByIdBanqueDao(int pIdBanque) {
		return (Banque) sessionFactory.getCurrentSession().get(Banque.class, pIdBanque);
	}

	@Transactional(readOnly = true)
	public Banque getByCbDao(int numCb) {
		
		//1. récupération de la session
		Session session = sessionFactory.getCurrentSession();
		
		//2. création de la requête HQL
		String reqHQL = "SELECT b FROM banque b WHERE b.numeroCB=?1";
		
		//3. création de la requête
		Query query = session.createQuery(reqHQL);
		
		//4. passage des params dans la requête
		query.setParameter(1, numCb);
		
		//5. envoi de la requête et récupération du résultat
		
		List<Banque> listeB = query.list();
		
		if(listeB !=null) {
			Banque banqueOut = null;
		for (Banque banque : listeB) {
			
		 banqueOut = banque;
		
		}
		return banqueOut;
		}
			return null;
		
	}
	
		
	@Transactional
	public void updateBanqueDao(Banque pBanque) {
		sessionFactory.getCurrentSession().update(pBanque);
		
	}
	
	
	
	
}
