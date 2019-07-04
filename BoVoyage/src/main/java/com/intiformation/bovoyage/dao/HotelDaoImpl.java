package com.intiformation.bovoyage.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.intiformation.bovoyage.entity.Hotel;

@Repository
public class HotelDaoImpl implements IHotelDao {

	/* --------------- ASSOCATIOND UML EN JAVA --------------------- */
	@Autowired
	private SessionFactory sessionFactory;

	// Setter pour l'injection Srping

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/* --------------- REDEFINITION DES METHODE --------------------- */
	/**
	 * Permet de rechercher un Hotel par son Id
	 */

	@Transactional(readOnly = true)
	public Hotel getByIdHotelDao(int idHotel) {

		// 1. Recuperation de la sessio
		Session session = sessionFactory.getCurrentSession();

		// 2. Rechercher le produit et le stocker

		Hotel hotel = (Hotel) session.get(Hotel.class, idHotel);

		// 3; retour de la methode

		return hotel;
	}

	/**
	 * Methode qui permet de recupérer tous les hotel
	 */
	@Transactional(readOnly = true)
	public List<Hotel> getAllHotelDao() {
		// 1. Recuperation de la session
		Session session = sessionFactory.getCurrentSession();

		// 2. Creation de la requeteHQL
		String reqHQL = "FROM hotel h";

		// 3. Creation de la demande et recuperation du resultat

		List<Hotel> listOut = sessionFactory.getCurrentSession().createQuery(reqHQL).list();

		return listOut;
	}

	/**
	 * Methode qui permet de recupérer les hotels par l'id de la formule
	 */
	public List<Hotel> getHotelByIdFormule(int idFormule) {
		// 1. Recuperation de la session
		Session session = sessionFactory.getCurrentSession();
		
		// 2. Creation de la requeteHQL
		
		String reqHQL ="SELECT h FROM hotel h, formule f WHERE h.formule.idFormule=?1";
		
		// 3. Creation de la requete
		Query query = session.createQuery(reqHQL);
		
		// 4. Passage des paramètres dans la requete
		
		query.setParameter(1, idFormule);
		
		// 5. Envoi de la requete et recuperation du resultat
		
		List<Hotel> listOut = query.list();
		
		// Renvoi de la la liste des hotels
		return listOut;
	}

}
