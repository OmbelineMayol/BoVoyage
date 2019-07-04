package com.intiformation.bovoyage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiformation.bovoyage.dao.IClientDao;
import com.intiformation.bovoyage.entity.Client;

@Service
public class ClientServiceImpl implements IClientService {

	// Déclaration de la couche DAO
	@Autowired
	private IClientDao clientDao;

	// setter
	public void setClientDao(IClientDao clientDao) {
		this.clientDao = clientDao;
	}

	//rédéfinition des méthodes
	public void addClientService(Client pClient) {
		clientDao.addClientDao(pClient);
		
	}

	public Client getByIdClientService(int pIdClient) {
		return clientDao.getByIdClientDao(pIdClient);
		
	}

	public void updateClientService(Client pClient) {
		clientDao.updateClientDao(pClient);
		
	}

	public void deleteClientService(int pIdClient) {
		clientDao.deleteClientDao(pIdClient);
		
	}

	public List<Client> getAllClients() {
		return clientDao.getAllClients();
	}

	
}
