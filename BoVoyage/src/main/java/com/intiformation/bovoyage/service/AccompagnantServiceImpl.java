package com.intiformation.bovoyage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiformation.bovoyage.dao.IAccompagnantDao;
import com.intiformation.bovoyage.entity.Accompagnant;
import com.intiformation.bovoyage.entity.Client;

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
		accompagnantDao.addAccompagnantDao(pAccompagnant);
	}

	public Accompagnant getByIdAccompagnantService(int pIdAccompagnant) {

		return accompagnantDao.getByIdAccompagnantDao(pIdAccompagnant);
	}

	public void updateAccompagnantService(Accompagnant pAccompagnant) {
		accompagnantDao.updateAccompagnantDao(pAccompagnant);
	}

	public void deleteAccompagnantService(int pIdAccompagnant) {
		accompagnantDao.deleteAccompagnantDao(pIdAccompagnant);
	}

	public List<Accompagnant> getAllAccompagnant() {
		return accompagnantDao.getAllAccompagnant();
	}

	public List<Accompagnant> getAllAccompagnantByClient(Client clientIn) {
		
		return accompagnantDao.getAllAccompagnantByClient(clientIn);
	}
	
	

}
