package com.intiformation.bovoyage.dao;

import com.intiformation.bovoyage.entity.Banque;

public interface IBanqueDao {

	public Banque getByIdBanqueDao(int pIdBanque);
	
	public Banque getByCbDao(int numCb);
	
	public void updateBanqueDao(Banque pBanque);
	
	
	
}
