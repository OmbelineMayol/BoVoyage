package com.intiformation.bovoyage.wsrest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.intiformation.bovoyage.entity.Reservation;
import com.intiformation.bovoyage.service.IReservationService;


@RestController

public class ReservationWSRest {

	/*-------ASSOCIATION AVEC LA COUCHE SERVICE---------------*/
	@Autowired
	IReservationService reservationService;

	//Setter pour l'injection spring
	public void setReservationService(IReservationService reservationService) {
		this.reservationService = reservationService;
	}
	
	
	/*---------------METHODE--------------------------------*/
	/**
	 * Liste des réservations
	 * @return
	 */
	@RequestMapping(value= "/reservations/getAll", method = RequestMethod.GET, headers = "Accept=application/json", produces="application/json")
	public List<Reservation> getAllReservations(){
		List<Reservation> listeReservations = reservationService.getAllReservationsService();
		return listeReservations;
	}
	
	/**
	 * Sélection d'une réservation
	 * @param idResa
	 * @return
	 */
	@RequestMapping(value = "/reservations/getById/{idResa}", method=RequestMethod.GET, produces= {"application/json"})
	public Reservation getByIdReservation(@PathVariable("idResa")int idResa) {
		return reservationService.getByIdReservationService(idResa);
	}
	
	/**
	 * Ajout d'une réservation
	 * @param resa
	 */
	@RequestMapping(value="/reservations/add", method=RequestMethod.POST, produces="application/json",consumes="application/json")
	public void addReservation(@RequestBody Reservation resa) {
		reservationService.addReservationService(resa);
	}
	
	/**
	 * Modif d'une réservation
	 * @param resa
	 */
	@RequestMapping(value="/reservations/update", method=RequestMethod.PUT, produces="application/json", consumes="application/json")
	public void updateReservation(@RequestBody Reservation resa) {
		reservationService.updateReservationService(resa);
	}
	
	/**
	 * suppression d'un accompagnant
	 * @param idResa
	 */
	@RequestMapping(value="/reservations/delete/{idResa}", method=RequestMethod.DELETE, headers="Accept=application/json", produces="application/json")
	public void deleteReservation(@PathVariable("idResa")int idResa) {
		reservationService.deleteReservationService(idResa);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
