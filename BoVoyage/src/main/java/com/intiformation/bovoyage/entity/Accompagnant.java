package com.intiformation.bovoyage.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Accompagnant extends Personne{
	
	/* -------- ASSOCIATIONS UML -----------------*/
	
	
	@ManyToOne
	@JoinColumn(name="client_id", referencedColumnName="id_client")
	private Client client;
	

}
