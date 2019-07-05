package com.intiformation.bovoyage.service;

import com.intiformation.bovoyage.entity.Banque;

public interface IBanqueService {

	public Banque getByIdBanqueService(int pIdBanque);
	
	public Banque getByCbService(int numCb);
	
	public void updateBanqueService(Banque pBanque);
}
