package com.intiformation.bovoyage.service;

import java.util.List;

import com.intiformation.bovoyage.entity.Voiture;

public interface IVoitureService {

	public Voiture getByIdVoitureService(int pIdVoiture);

	public List<Voiture> getAllVoitures();
}
