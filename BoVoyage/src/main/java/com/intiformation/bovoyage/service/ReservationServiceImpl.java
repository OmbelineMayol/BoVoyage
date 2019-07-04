package com.intiformation.bovoyage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiformation.bovoyage.dao.IReservationDao;
import com.intiformation.bovoyage.entity.Reservation;

@Service
public class ReservationServiceImpl implements IReservationService {

	// Déclaration du DAO
	@Autowired
	private IReservationDao reservationDao;

	/**
	 * setter pour injection spring
	 */
	public void setReservationDao(IReservationDao reservationDao) {
		this.reservationDao = reservationDao;
	}

	// rédéfinition des méthodes
	public void addReservationService(Reservation resa) {
		reservationDao.addReservationDao(resa);

	}

	public Reservation getByIdReservationService(int idResa) {

		return reservationDao.getByIdReservationDao(idResa);
	}

	public void updateReservationService(Reservation resa) {
		reservationDao.updateReservationDao(resa);

	}

	public void deleteReservationService(int idResa) {
		reservationDao.deleteReservationDao(idResa);

	}

	public List<Reservation> getAllReservationsService() {

		return reservationDao.getAllReservationsDao();
	}

}
