package com.intiformation.bovoyage.service;

import java.util.List;

import com.intiformation.bovoyage.entity.Accompagnant;

public interface IAccompagnantService {

	public void addAccompagnantService(Accompagnant pAccompagnant);
	
	public Accompagnant getByIdAccompagnantService (int pIdAccompagnant);
	
	public void updateAccompagnantService (Accompagnant pAccompagnant);
	
	public void deleteAccompagnantService (int pIdAccompagnant);
	
	public List<Accompagnant> getAllAccompagnant();
}
