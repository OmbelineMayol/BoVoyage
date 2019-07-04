package com.intiformation.bovoyage.dao;

import java.util.List;

import com.intiformation.bovoyage.entity.Reservation;

public interface IReservationDao {
	
	public void addReservationDao(Reservation pReservation);
	
	public Reservation getByIdReservationDao(int pIdReservation);
	
	public void updateReservationDao(Reservation pReservation);
	
	public void deleteReservationDao(int pIdReservation);
	
	public List<Reservation> getAllReservationsDao();
}
