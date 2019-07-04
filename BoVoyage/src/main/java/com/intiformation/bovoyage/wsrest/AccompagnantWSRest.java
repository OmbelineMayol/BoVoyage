package com.intiformation.bovoyage.wsrest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.intiformation.bovoyage.entity.Accompagnant;
import com.intiformation.bovoyage.entity.Client;
import com.intiformation.bovoyage.service.IAccompagnantService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AccompagnantWSRest {
	
	/*--------- ASSOCIATION AVEC LA COUCHE SERVICE -------------- */
	
	@Autowired
	IAccompagnantService accompagnantService;
	
	// Setter pour l'injection Spring
	
	public void setAccompagnantService(IAccompagnantService accompagnantService) {
		this.accompagnantService = accompagnantService;
	}
	

	/*------------------------- METHODE ------------------------ */

	/**
	 * Liste des accompagnants
	 * @return
	 */
	@RequestMapping(value = "/accompagnants/getAll", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Accompagnant> getAllAccompagnants() {
		List<Accompagnant> listeAccompagnants = accompagnantService.getAllAccompagnant();
		return listeAccompagnants;
	}

	/**
	 * Liste des accompagnants d'un client
	 * @return
	 */
	@RequestMapping(value = "/accompagnants/getAllByClient", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Accompagnant> getAllAccompagnantsByClient(Client clientIn) {
		List<Accompagnant> listeAccompagnantsByClient = accompagnantService.getAllAccompagnantByClient(clientIn);
		return listeAccompagnantsByClient;
	}
	
	/**
	 * Selection d'un accompagnant
	 * @param idAccompagnantIn
	 * @return
	 */
	@RequestMapping(value = "/accompagnants/getById/{idAccompagnant}", method = RequestMethod.GET, produces={"application/json"} )
	public Accompagnant getAccompagnantById(@PathVariable("idAccompagnant") int idAccompagnantIn) {
		return accompagnantService.getByIdAccompagnantService(idAccompagnantIn);
	}

	/**
	 * Ajout d'un accompagnant
	 * @param accompagnantIn
	 */
	@RequestMapping(value = "/accompagnants/add", method = RequestMethod.POST, produces= "application/json", consumes="application/json")
	public void addAccompagnant(@RequestBody Accompagnant accompagnantIn, Client clientIn) {
		
		accompagnantIn.setClient(clientIn);
		accompagnantService.addAccompagnantService(accompagnantIn);
	}

	/**
	 * Modification d'un accompagnant
	 * @param accompagnantIn
	 */
	@RequestMapping(value = "/accompagnants/update", method = RequestMethod.PUT, produces= "application/json",consumes="application/json")
	public void updateClient(@RequestBody Accompagnant accompagnantIn) {
		accompagnantService.updateAccompagnantService(accompagnantIn);

	}

	/**
	 * Suppression d'un accompagnant
	 * @param idAccompagnantsIn
	 */
	@RequestMapping(value = "/accompagnants/delete/{idAccompagnant}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteAccompagnant(@PathVariable("idAccompagnant") int idAccompagnantIn) {
		accompagnantService.deleteAccompagnantService(idAccompagnantIn);

	}

}
