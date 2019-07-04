package com.intiformation.bovoyage.service;

import java.util.List;

import com.intiformation.bovoyage.entity.Formule;

public interface IFormuleService {
	
	public List<Formule> getAllFormuleService();

	public List<Formule> getFormuleByPaysService(String nomPays);

	public List<Formule> getFormuleByContinentService(String nomContinent);

	public Formule getFormuleByIdService(int idFormule);

}
