package com.intiformation.bovoyage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiformation.bovoyage.dao.IVoitureDao;
import com.intiformation.bovoyage.entity.Voiture;

@Service
public class VoitureServiceImpl implements IVoitureService {

	// Déclaration du DAO
	@Autowired
	private IVoitureDao voitureDao;

	/**
	 * setter pour injection spring
	 */
	public void setVoitureDao(IVoitureDao voitureDao) {
		this.voitureDao = voitureDao;
	}

	// redéfinition des méthodes

	public Voiture getByIdVoitureService(int pIdVoiture) {

		return voitureDao.getByIdVoitureDao(pIdVoiture);
	}

	public List<Voiture> getAllVoitures() {

		return voitureDao.getAllVoitures();
	}

}
