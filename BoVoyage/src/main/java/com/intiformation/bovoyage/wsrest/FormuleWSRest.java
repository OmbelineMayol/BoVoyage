package com.intiformation.bovoyage.wsrest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.intiformation.bovoyage.entity.Formule;
import com.intiformation.bovoyage.service.IFormuleService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class FormuleWSRest {

	/* ---------- ASSOCIATION AVEC LA COUCHE SERVICE ----------- */
	@Autowired
	private IFormuleService formuleService;

	// Ajout du setter pour l'injection spring

	public void setFormuleService(IFormuleService formuleService) {
		this.formuleService = formuleService;
	}

	/* ------------- METHODES EXPOSEES DANS LE WS -------------- */

	/**
	 * Methode qui renvoie la liste de toutes les formules
	 * 
	 * @return
	 */
	@RequestMapping(value = "/formules/getAll", method = RequestMethod.GET, produces="application/json")
	public List<Formule> getAllFormules() {
		return formuleService.getAllFormuleService();
	}

	/**
	 * retourne la liste des formule selectionnée par Pays
	 * 
	 * @param nomPays
	 * @return
	 */
	@RequestMapping(value = "/formules/getByPays/{pnomPays}", method = RequestMethod.GET, produces="application/json")
	public List<Formule> getFormuleByPaysString(@PathVariable("pnomPays") String nomPays) {
		return formuleService.getFormuleByPaysService(nomPays);
	}

	/**
	 * retourne la liste des formules par continents
	 * 
	 * @param nomContinent
	 * @return
	 */
	@RequestMapping(value = "/formules/getByContinent/{pnomContinent}", method = RequestMethod.GET, produces="application/json")
	public List<Formule> getFormuleByContinent(@PathVariable("pnomContinent")String nomContinent) {
		return formuleService.getFormuleByContinentService(nomContinent);
	}

}
