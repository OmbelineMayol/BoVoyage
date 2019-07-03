package com.intiformation.bovoyage.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.intiformation.bovoyage.entity.Agent;

@Repository
public class AgentDaoImpl implements IAgentDao{
	
	
	
	// session factory hibernate
	
			@Autowired
			private SessionFactory sessionFactory;
			
			/**
			 * Setter de la sessionFactory
			 */
			public void setSf(SessionFactory sessionFactory) {
				this.sessionFactory = sessionFactory;
	}// Initialisation sessionFactory
			
	@Transactional
	public void addAgentDao (Agent agentIn) {
				
			//getCurrentSession() = recup de la session  dans une meme transaction
		sessionFactory.getCurrentSession().save(agentIn);
	}//Fin addAgentDao

	public Agent getByIdAgentDao(int idAgentIn) {
		
		return (Agent) sessionFactory.getCurrentSession().get(Agent.class, idAgentIn);
	}

	public void updateAgentDao(Agent agentIn) {
		sessionFactory.getCurrentSession().update(agentIn);
		
	}

	public void deleteAgentDao(int idAgentIn) {
		Agent agentOut = (Agent) sessionFactory.getCurrentSession().get(Agent.class, idAgentIn);
		sessionFactory.getCurrentSession().delete(agentOut);	
		
	}

	public List<Agent> getAllAgentDao() {
		List<Agent> listeAgentOut =	sessionFactory.getCurrentSession().createQuery("FROM agent a").list();
		return listeAgentOut;
	}

}
