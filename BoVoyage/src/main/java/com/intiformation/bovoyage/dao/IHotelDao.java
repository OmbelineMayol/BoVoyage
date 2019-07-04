package com.intiformation.bovoyage.dao;

import java.util.List;

import com.intiformation.bovoyage.entity.Hotel;

public interface IHotelDao {
	
	public Hotel getByIdHotelDao(int idHotel);
	
	public List<Hotel> getAllHotelDao();
	
	public List<Hotel> getHotelByIdFormule(int idFormule);
	

}
