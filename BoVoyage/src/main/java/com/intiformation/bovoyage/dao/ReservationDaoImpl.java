package com.intiformation.bovoyage.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.intiformation.bovoyage.entity.Reservation;

@Repository
public class ReservationDaoImpl implements IReservationDao {

	// Session factory hibernate
	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * setter pour injection spring
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	// redéfinition des méthodes
	@Transactional
	public void addReservationDao(Reservation pReservation) {
		// récup de la session
		sessionFactory.getCurrentSession().save(pReservation);

	}

	@Transactional(readOnly = true)
	public Reservation getByIdReservationDao(int pIdReservation) {
		
		return (Reservation) sessionFactory.getCurrentSession().get(Reservation.class, pIdReservation);
	}

	@Transactional
	public void updateReservationDao(Reservation pReservation) {
		sessionFactory.getCurrentSession().update(pReservation);

	}

	@Transactional
	public void deleteReservationDao(int pIdReservation) {
		Reservation reservation = (Reservation) sessionFactory.getCurrentSession().get(Reservation.class, pIdReservation);
		sessionFactory.getCurrentSession().delete(reservation);

	}

	@Transactional(readOnly = true)
	public List<Reservation> getAllReservationsDao() {
		List<Reservation> listeReservationsOut = sessionFactory.getCurrentSession().createQuery("FROM reservation resa").list();
		return listeReservationsOut;
	}

}
