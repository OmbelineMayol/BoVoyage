package com.intiformation.bovoyage.service;

import java.util.List;

import com.intiformation.bovoyage.entity.Reservation;

public interface IReservationService {
	
	public void addReservationService(Reservation resa);
	
	public Reservation getByIdReservationService (int idResa);
	
	public void updateReservationService (Reservation resa);
	
	public void deleteReservationService (int idResa);
	
	public List<Reservation> getAllReservationsService();
}
