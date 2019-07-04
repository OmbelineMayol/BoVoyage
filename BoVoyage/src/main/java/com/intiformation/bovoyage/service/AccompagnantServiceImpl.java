package com.intiformation.bovoyage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.intiformation.bovoyage.dao.IAccompagnantDao;
import com.intiformation.bovoyage.entity.Accompagnant;

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
