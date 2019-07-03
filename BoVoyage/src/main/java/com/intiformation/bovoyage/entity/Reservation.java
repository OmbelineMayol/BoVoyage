package com.intiformation.bovoyage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Reservation")
@Table(name = "Reservation")
public class Reservation {

	// Déclaration des attributs
	@Id
	@GeneratedValue()
	@Column(name = "id_resa")
	private int idResa;
	
	@Column(name = "nDossier")
	private double nDossier;
	
	@Column(name = "prixTotal")
	private double prixTotal;
	
	@Column(name = "nbrePlace")
	private int nbrePlace;
	
	@Column(name = "assuranceA")
	private int assuranceA;
	
	@Column(name = "etat")
	private String etat;
	
	@Column(name = "nbreAccompagnant")
	private int nbreAccompagnant;

	//Transformation de l'association UML en java
	private Formule formule;
	private Client client;
	
	
	// Déclaration des constructeurs
	public Reservation() {
		super();
	}

	public Reservation(double nDossier, double prixTotal, int nbrePlace, int assuranceA, String etat,
			int nbreAccompagnant) {
		super();
		this.nDossier = nDossier;
		this.prixTotal = prixTotal;
		this.nbrePlace = nbrePlace;
		this.assuranceA = assuranceA;
		this.etat = etat;
		this.nbreAccompagnant = nbreAccompagnant;
	}

	// Déclaration des getters et setters

	public int getIdResa() {
		return idResa;
	}

	public void setIdResa(int idResa) {
		this.idResa = idResa;
	}

	public double getnDossier() {
		return nDossier;
	}

	public void setnDossier(double nDossier) {
		this.nDossier = nDossier;
	}

	public double getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(double prixTotal) {
		this.prixTotal = prixTotal;
	}

	public int getNbrePlace() {
		return nbrePlace;
	}

	public void setNbrePlace(int nbrePlace) {
		this.nbrePlace = nbrePlace;
	}

	public int getAssuranceA() {
		return assuranceA;
	}

	public void setAssuranceA(int assuranceA) {
		this.assuranceA = assuranceA;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public int getNbreAccompagnant() {
		return nbreAccompagnant;
	}

	public void setNbreAccompagnant(int nbreAccompagnant) {
		this.nbreAccompagnant = nbreAccompagnant;
	}

	public Formule getFormule() {
		return formule;
	}

	public void setFormule(Formule formule) {
		this.formule = formule;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}// endclass