package com.intiformation.bovoyage.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.intiformation.bovoyage.entity.Client;

@Repository
public class ClientDaoImpl implements IClientDao {

	// Création de la session factory d'hibernate
	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * setters de la sessionFactory pour injection spring <br/>
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	// méthodes 
	@Transactional
	public void addClientDao(Client pClient) {
		//récupération de la session courante
		sessionFactory.getCurrentSession().save(pClient); 
	}
	
	@Transactional
	public Client getByIdClientDao(int pIdClient) {
		return (Client) sessionFactory.getCurrentSession().get(Client.class, pIdClient);
	}
	
	@Transactional
	public void updateClientDao(Client pClient) {
		sessionFactory.getCurrentSession().update(pClient);
	}
	
	@Transactional
	public void deleteClientDao(int pIdClient) {
		Client client = (Client) sessionFactory.getCurrentSession().get(Client.class, pIdClient);
		sessionFactory.getCurrentSession().delete(client);
	}

	@Transactional
	public List<Client> getAllClients() {
		 List<Client> listeClientOut = sessionFactory.getCurrentSession().createQuery("FROM client cl").list();
		 return listeClientOut;
	}

}
