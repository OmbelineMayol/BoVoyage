package com.intiformation.bovoyage.service;

import java.util.List;

import com.intiformation.bovoyage.entity.Client;

public interface IClientService {

	public void addClientDao(Client pClient);

	public Client getByIdClientDao(int pIdClient);

	public void updateClientDao(Client pClient);

	public void deleteClientDao(int pIdClient);

	public List<Client> getAllClients();
}
