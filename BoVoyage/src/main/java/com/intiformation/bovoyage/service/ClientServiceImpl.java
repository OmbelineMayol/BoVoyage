package com.intiformation.bovoyage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiformation.bovoyage.entity.Client;

@Service
public class ClientServiceImpl implements IClientService {

	// Déclaration de la couche DAO
	@Autowired
	private IClientService clientService;

	// setter
	public void setClientService(IClientService clientService) {
		this.clientService = clientService;
	}

	// Redéfinition des méthodes
	public void addClientDao(Client pClient) {

	}

	public Client getByIdClientDao(int pIdClient) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateClientDao(Client pClient) {
		// TODO Auto-generated method stub

	}

	public void deleteClientDao(int pIdClient) {
		// TODO Auto-generated method stub

	}

	public List<Client> getAllClients() {
		// TODO Auto-generated method stub
		return null;
	}

}
