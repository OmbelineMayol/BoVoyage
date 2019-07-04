package com.intiformation.bovoyage.wsrest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.intiformation.bovoyage.entity.Client;
import com.intiformation.bovoyage.service.IClientService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ClientWSRest {
	
	/*--------- ASSOCIATION AVEC LA COUCHE SERVICE -------------- */
	
	@Autowired
	IClientService clientService;

	// Setter pour l'injection Spring
	
	public void setClientService(IClientService clientService) {
		this.clientService = clientService;
	}
	

	/*------------------------- METHODE ------------------------ */
		
	/**
	 * Liste des clients
	 * @return
	 */
	@RequestMapping(value = "/clients/getAll", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Client> getAllClients() {
		List<Client> listeClients = clientService.getAllClients();
		return listeClients;
	}


	/**
	 * Selection d'un client
	 * @param idClientIn
	 * @return
	 */
	@RequestMapping(value = "/clients/getById/{idClient}", method = RequestMethod.GET, produces={"application/json"} )
	public Client getClientById(@PathVariable("idClient") int idClientIn) {
		return clientService.getByIdClientService(idClientIn);
	}

	/**
	 * Ajout d'un client
	 * @param clientIn
	 */
	@RequestMapping(value = "/clients/add", method = RequestMethod.POST, produces= "application/json", consumes="application/json")
	public void addClient(@RequestBody Client clientIn) {
		clientService.addClientService(clientIn);
	}

	/**
	 * Modification d'un client
	 * @param clientIn
	 */
	@RequestMapping(value = "/clients/update", method = RequestMethod.PUT, produces= "application/json",consumes="application/json")
	public void updateClient(@RequestBody Client clientIn) {
		clientService.updateClientService(clientIn);

	}

	/**
	 * Suppression d'un client
	 * @param idClientIn
	 */
	@RequestMapping(value = "/clients/delete/{idClient}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteClient(@PathVariable("idClient") int idClientIn) {
		clientService.deleteClientService(idClientIn);

	}


}
