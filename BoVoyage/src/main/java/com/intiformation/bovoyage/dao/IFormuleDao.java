package com.intiformation.bovoyage.dao;

import java.util.List;

import com.intiformation.bovoyage.entity.Formule;

public interface IFormuleDao {
	
	public List<Formule> getAllFormuleDao();
	
	public List<Formule> getFormuleByPaysDao(String nomPays);
	
	public List<Formule> getFormuleByContinentDao(String nomContinent);
	
	public Formule getFormuleById(int idFormule);

}
