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
	 * Recp�ration de toutes les formules
	 */
	public List<Formule> getAllFormuleService() {		
		return formuleDao.getAllFormuleDao();
	}

	/**
	 * r�cup�ration des formules par Pays
	 */
	public List<Formule> getFormuleByPaysService(String nomPays) {
		return formuleDao.getFormuleByPaysDao(nomPays);
	}

	/**
	 * R�cup�ration des formules par continent
	 */
	public List<Formule> getFormuleByContinentService(String nomContinent) {
		return formuleDao.getFormuleByContinentDao(nomContinent);
	}

	/**
	 * R�cup�ration d'une formule par id
	 */
	public Formule getFormuleByIdService(int idFormule) {
		return formuleDao.getFormuleById(idFormule);
	}

}
