package com.intiformation.bovoyage.dao;

import java.util.List;

import com.intiformation.bovoyage.entity.Client;

public interface IClientDao {

	public void addClientDao(Client pClient);

	public Client getByIdClientDao(int pIdClient);

	public void updateClientDao(Client pClient);

	public void deleteClientDao(int pIdClient);

	public List<Client> getAllClients();
	
	public Client isExist(String email, String mdp);
	
	

}
