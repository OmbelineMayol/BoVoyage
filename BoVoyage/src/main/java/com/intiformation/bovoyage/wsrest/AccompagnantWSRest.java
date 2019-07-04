package com.intiformation.bovoyage.wsrest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.intiformation.bovoyage.entity.Accompagnant;
import com.intiformation.bovoyage.service.IAccompagnantService;



public class AccompagnantWSRest {
	
	/**
	 * Liaison à la couche Service
	 */
	@Autowired
	IAccompagnantService accompagnantService;

	/**
	 * Liste des accompagnants
	 * @return
	 */
	@RequestMapping(value = "/accompagnants", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Accompagnant> getAllAccompagnants() {
		List<Accompagnant> listeAccompagnants = accompagnantService.getAllAccompagnant();
		return listeAccompagnants;
	}

	/**
	 * Selection d'un accompagnant
	 * @param idAccompagnantIn
	 * @return
	 */
	@RequestMapping(value = "/accompagnants/{idAccompagnantIn}", method = RequestMethod.GET, produces={"application/json"} )
	public Accompagnant getAccompagnantById(@PathVariable int idAccompagnantIn) {
		return accompagnantService.getByIdAccompagnantService(idAccompagnantIn);
	}

	/**
	 * Ajout d'un accompagnant
	 * @param accompagnantIn
	 */
	@RequestMapping(value = "/accompagnants", method = RequestMethod.POST, produces= "application/json", consumes="application/json")
	public void addAccompagnant(@RequestBody Accompagnant accompagnantIn) {
		accompagnantService.addAccompagnantService(accompagnantIn);
	}

	/**
	 * Modification d'un accompagnant
	 * @param accompagnantIn
	 */
	@RequestMapping(value = "/accompagnants", method = RequestMethod.PUT, produces= "application/json",consumes="application/json")
	public void updateClient(@RequestBody Accompagnant accompagnantIn) {
		accompagnantService.updateAccompagnantService(accompagnantIn);

	}

	/**
	 * Suppression d'un accompagnant
	 * @param idAccompagnantsIn
	 */
	@RequestMapping(value = "/accompagnants/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteAccompagnant(@PathVariable("id") int idAccompagnantIn) {
		accompagnantService.deleteAccompagnantService(idAccompagnantIn);

	}

}
