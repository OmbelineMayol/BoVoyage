package com.intiformation.bovoyage.dao;

import java.util.List;

import com.intiformation.bovoyage.entity.Voiture;

public interface IVoitureDao {

	public Voiture getByIdVoitureDao(int pIdVoiture);

	public List<Voiture> getAllVoitures();

}
