package com.intiformation.bovoyage.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name= "client")
@Table(name= "clients")
public class Client extends Personne{

	// Déclaration des attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_client")
	private String idClient;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "numCB")
	private double numCB;
	
	@Column(name = "actived")
	private int actived;

	//Transformation de l'association UML en java
	@OneToOne(mappedBy="client")
	private Role role;
	
	@OneToMany(mappedBy="client")
	private List<Accompagnant> listeAccompagnants; 
	
	@OneToOne(mappedBy="client")
	private Reservation reservation;
	
	// Déclaration des constructeurs
	public Client() {
		super();
	}

	public Client(String password, double numCB, int actived) {
		super();
		this.password = password;
		this.numCB = numCB;
		this.actived = actived;
	}


	// Déclaration getters et setters
	public String getIdClient() {
		return idClient;
	}

	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getNumCB() {
		return numCB;
	}

	public void setNumCB(double numCB) {
		this.numCB = numCB;
	}

	public int getActived() {
		return actived;
	}

	public void setActived(int actived) {
		this.actived = actived;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<Accompagnant> getListeAccompagnants() {
		return listeAccompagnants;
	}

	public void setListeAccompagnants(List<Accompagnant> listeAccompagnants) {
		this.listeAccompagnants = listeAccompagnants;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	

}
