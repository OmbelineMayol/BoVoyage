package com.intiformation.bovoyage.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.intiformation.bovoyage.entity.Client;

@Repository
public class ClientDaoImpl implements IClientDao {

	// Cr�ation de la session factory d'hibernate
	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * setters de la sessionFactory pour injection spring <br/>
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	// m�thodes
	@Transactional
	public void addClientDao(Client pClient) {
		// r�cup�ration de la session courante
		sessionFactory.getCurrentSession().save(pClient);
	}

	@Transactional(readOnly = true)
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

	@Transactional(readOnly = true)
	public List<Client> getAllClients() {
		List<Client> listeClientOut = sessionFactory.getCurrentSession().createQuery("FROM client cl").list();
		return listeClientOut;
	}

	@Override
	public Client isExist(String email, String mdp) {
		
		// Recuperation de la session 
		Session session = sessionFactory.getCurrentSession();
		
		// Creation de la requete HQL
		String reqHql ="SELECT cl FROM client cl WHERE cl.email=? AND cl.password=?";
		
		// Creation de la requete
		
		Query query = session.createQuery(reqHql);
		
		// Passage des param�tres � la requete
		
		query.setParameter(0, email);
		query.setParameter(1, mdp);
		
		// R�cup�ration du r�sultat
		
		List<Client> listOut = query.list();
		
		// Interpr�tation du r�sultat
		
		Client client = new Client();
		
		for (Client cl : listOut) {
			client = cl;
		}
		
		// renvoie du resultat
		
		return client;
	}

}
