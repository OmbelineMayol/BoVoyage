package com.intiformation.bovoyage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiformation.bovoyage.dao.IBanqueDao;
import com.intiformation.bovoyage.entity.Banque;

@Service
public class BanqueServiceImpl implements IBanqueService {

	/*----------association avec la couche dao-------*/
	@Autowired
	private IBanqueDao banqueDao;

	// setter
	public void setBanqueDao(IBanqueDao banqueDao) {
		this.banqueDao = banqueDao;
	}

	// redéfinition des méthodes
	public Banque getByIdBanqueService(int pIdBanque) {
		return banqueDao.getByIdBanqueDao(pIdBanque);
	}

	public Banque getByCbService(int numCb) {
		return banqueDao.getByCbDao(numCb);
	}

	public void updateBanqueService(Banque pBanque) {
		banqueDao.updateBanqueDao(pBanque);
	}

}
