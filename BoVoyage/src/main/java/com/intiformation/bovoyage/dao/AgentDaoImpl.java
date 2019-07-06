package com.intiformation.bovoyage.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.intiformation.bovoyage.entity.Agent;

@Repository
public class AgentDaoImpl implements IAgentDao {

	// ------ Session factory hibernate

	@Autowired
	private SessionFactory sessionFactory;

	// ----- Setter de la session Factory pour l'injection Spring
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	// ----- Redefinition des methodes

	@Transactional
	public void addAgentDao(Agent agentIn) {

		// getCurrentSession() = recup de la session dans une meme transaction
		sessionFactory.getCurrentSession().save(agentIn);
	}// Fin addAgentDao

	@Transactional(readOnly = true)
	public Agent getByIdAgentDao(int idAgentIn) {

		return (Agent) sessionFactory.getCurrentSession().get(Agent.class, idAgentIn);
	}

	@Transactional
	public void updateAgentDao(Agent agentIn) {
		sessionFactory.getCurrentSession().update(agentIn);

	}

	@Transactional
	public void deleteAgentDao(int idAgentIn) {
		Agent agentOut = (Agent) sessionFactory.getCurrentSession().get(Agent.class, idAgentIn);
		sessionFactory.getCurrentSession().delete(agentOut);

	}

	@Transactional(readOnly = true)
	public List<Agent> getAllAgentDao() {
		List<Agent> listeAgentOut = sessionFactory.getCurrentSession().createQuery("FROM agent a").list();
		return listeAgentOut;
	}

	@Override
	@Transactional
	public Agent isExist(String username, String password) {
		// Recuperation de la session
		Session session = sessionFactory.getCurrentSession();
		
		// Creation de la requete HQL
		String reqHql = "SELECT ag FROM agent ag WHERE ag.username= ? AND ag.password=?";
		
		// Creation de la query
		Query query = session.createQuery(reqHql);
		
		// Passage des paramètres de la requetes
		query.setParameter(0, username);
		query.setParameter(1, password);
		
		// Envoi de la requete et recuperation du resultat
		List<Agent> listOut = query.list();
		
		// Interpretation du resultat
		
		Agent agent = new Agent();
		
		for (Agent agt : listOut) {
			agent = agt;
		}
		
		return agent;
	}
	
	

}
