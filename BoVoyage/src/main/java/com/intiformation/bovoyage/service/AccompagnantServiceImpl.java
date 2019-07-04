package com.intiformation.bovoyage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiformation.bovoyage.dao.IAccompagnantDao;
import com.intiformation.bovoyage.entity.Accompagnant;

@Service
public class AccompagnantServiceImpl implements IAccompagnantService {

	// Déclaration du DAO
	@Autowired
	private IAccompagnantDao accompagnantDao;

	/**
	 * setter du dao pour injection spring
	 */
	public void setAccompagnantDao(IAccompagnantDao accompagnantDao) {
		this.accompagnantDao = accompagnantDao;
	}

	// redéfinition des méthodes
	public void addAccompagnantService(Accompagnant pAccompagnant) {

	}

	public Accompagnant getByIdAccompagnantService(int pIdAccompagnant) {

		return null;
	}

	public void updateAccompagnantService(Accompagnant pAccompagnant) {

	}

	public void deleteAccompagnantService(int pIdAccompagnant) {

	}

	public List<Accompagnant> getAllAccompagnant() {

		return null;
	}

}
