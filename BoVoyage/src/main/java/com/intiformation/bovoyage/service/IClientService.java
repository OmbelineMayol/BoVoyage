package com.intiformation.bovoyage.service;

import java.util.List;

import com.intiformation.bovoyage.entity.Client;

public interface IClientService {

	public void addClientService(Client pClient);

	public Client getByIdClientService(int pIdClient);

	public void updateClientService(Client pClient);

	public void deleteClientService(int pIdClient);

	public List<Client> getAllClients();
	
	public Client isExist(String email, String mdp);
}
