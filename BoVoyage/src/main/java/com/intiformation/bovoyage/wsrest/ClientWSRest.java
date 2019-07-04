package com.intiformation.bovoyage.wsrest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.intiformation.bovoyage.entity.Client;
import com.intiformation.bovoyage.service.IClientService;



public class ClientWSRest {
	
	/**
	 * Liaison à la couche Service
	 */
	@Autowired
	IClientService clientService;

	/**
	 * Liste des clients
	 * @return
	 */
	@RequestMapping(value = "/clients", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Client> getAllClients() {
		List<Client> listeClients = clientService.getAllClients();
		return listeClients;
	}

	/**
	 * Selection d'un client
	 * @param idClientIn
	 * @return
	 */
	@RequestMapping(value = "/clients/{idClientIn}", method = RequestMethod.GET, produces={"application/json"} )
	public Client getClientById(@PathVariable int idClientIn) {
		return clientService.getByIdClientService(idClientIn);
	}

	/**
	 * Ajout d'un client
	 * @param clientIn
	 */
	@RequestMapping(value = "/clients", method = RequestMethod.POST, produces= "application/json", consumes="application/json")
	public void addClient(@RequestBody Client clientIn) {
		clientService.addClientService(clientIn);
	}

	/**
	 * Modification d'un client
	 * @param clientIn
	 */
	@RequestMapping(value = "/clients", method = RequestMethod.PUT, produces= "application/json",consumes="application/json")
	public void updateClient(@RequestBody Client clientIn) {
		clientService.updateClientService(clientIn);

	}

	/**
	 * Suppression d'un client
	 * @param idClientIn
	 */
	@RequestMapping(value = "/clients/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteClient(@PathVariable("id") int idClientIn) {
		clientService.deleteClientService(idClientIn);

	}


}
