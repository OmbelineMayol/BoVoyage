package com.intiformation.bovoyage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiformation.bovoyage.dao.IFormuleDao;
import com.intiformation.bovoyage.entity.Formule;

@Service
public class FormuleServiceImpl implements IFormuleService {

	/* ------------- ASSOCIATION AVEC DAO --------------- */

	@Autowired
	private IFormuleDao formuleDao;

	// Setter pour l'injection Spring

	public void setFormuleDao(IFormuleDao formuleDao) {
		this.formuleDao = formuleDao;
	}
	
	/* ------------- IMPLEMENTATION DES METHODES --------------- */


	/**
	 * Recpération de toutes les formules
	 */
	public List<Formule> getAllFormuleService() {		
		return formuleDao.getAllFormuleDao();
	}

	/**
	 * récupération des formules par Pays
	 */
	public List<Formule> getFormuleByPaysService(String nomPays) {
		return formuleDao.getFormuleByPaysDao(nomPays);
	}

	/**
	 * Récupération des formules par continent
	 */
	public List<Formule> getFormuleByContinentService(String nomContinent) {
		return formuleDao.getFormuleByContinentDao(nomContinent);
	}

	/**
	 * Récupération d'une formule par id
	 */
	public Formule getFormuleByIdService(int idFormule) {
		return formuleDao.getFormuleById(idFormule);
	}

}
