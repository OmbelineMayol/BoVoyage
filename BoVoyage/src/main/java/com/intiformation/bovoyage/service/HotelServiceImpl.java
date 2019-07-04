package com.intiformation.bovoyage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiformation.bovoyage.dao.IHotelDao;
import com.intiformation.bovoyage.entity.Hotel;

@Service
public class HotelServiceImpl implements IHotelService{

	/* ------------- ASSOCIATION AVEC DAO --------------- */
	
	@Autowired
	private IHotelDao hotelDao;
	
	// Setter pour l'injection Spring
	
	public void setHotelDao(IHotelDao hotelDao) {
		this.hotelDao = hotelDao;
	}

	/* ------------- DEFINITION DES METHODE --------------- */
	
	/**
	 * Récupère un hotel par son id
	 */
	public Hotel getByIdHotelService(int idHotel) {
		
		return hotelDao.getByIdHotelDao(idHotel);
	}
	

	/**
	 * Recupère tous les hotels
	 */
	public List<Hotel> getAllHotelService() {
		
		return hotelDao.getAllHotelDao();
	}

	/**
	 * Récupère tous les hotels lié à une formule
	 */
	public List<Hotel> getHotelByIdFormuleService(int idFormule) {
		
		return hotelDao.getHotelByIdFormule(idFormule);
	}

}
