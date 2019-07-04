package com.intiformation.bovoyage.service;

import java.util.List;

import com.intiformation.bovoyage.entity.Hotel;

public interface IHotelService {

	public Hotel getByIdHotelService(int idHotel);

	public List<Hotel> getAllHotelService();

	public List<Hotel> getHotelByIdFormuleService(int idFormule);

}
