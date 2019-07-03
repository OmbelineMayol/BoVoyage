package com.intiformation.bovoyage.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="personnes")
public class Accompagnant extends Personne{
	
	/* -------------- ASSOCIATIONS UML -----------------*/
	
	
	@ManyToOne
	@JoinColumn(name="client_id", referencedColumnName="id_client")
	private Client client;
	
	
	/* ------------- GETTER ET SETTER -----------------*/
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
}
