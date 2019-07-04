package com.intiformation.bovoyage.dao;

import java.util.List;

import com.intiformation.bovoyage.entity.Accompagnant;

public interface IAccompagnantDao {

	public void addAccompagnantDao(Accompagnant pAccompagnant);

	public Accompagnant getByIdAccompagnantDao(int pIdAccompagnant);

	public void updateAccompagnantDao(Accompagnant pAccompagnant);

	public void deleteAccompagnantDao(int pIdAccompagnant);

	public List<Accompagnant> getAllAccompagnant();
}
