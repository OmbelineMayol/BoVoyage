package com.intiformation.bovoyage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="hotel")
@Table(name="hotels")
public class Hotel {
	
	/* ---------------- DECLARATION DES ATTRIBUTS  ---------------------*/
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_hotel")
	private int idHotel;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="nbrEtoiles")
	private int nbrEtoiles;
	
	@Column(name="ville")
	private String ville;
	
	@Column(name="dateIn")
	private String dateIn;
	
	@Column(name="dateOut")
	private String dateOut;
	
	
	/* --------------- DECLARATION DES ASSOCIATIONS--------------------*/
	@ManyToOne
	@JoinColumn(name="formule_id", referencedColumnName="id_formule")
	private Formule formule;
	
	
	/* ----------- DECLARATION DES CONSTRUCTEURS  ---------------------*/
	public Hotel() {
		super();
	}

	public Hotel(String nom, int nbrEtoiles, String ville, String dateIn, String dateOut) {
		super();
		this.nom = nom;
		this.nbrEtoiles = nbrEtoiles;
		this.ville = ville;
		this.dateIn = dateIn;
		this.dateOut = dateOut;
	}


	/* ----------- DECLARATION DES CONSTRUCTEURS  ---------------------*/
	
	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbrEtoiles() {
		return nbrEtoiles;
	}

	public void setNbrEtoiles(int nbrEtoiles) {
		this.nbrEtoiles = nbrEtoiles;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getDateIn() {
		return dateIn;
	}

	public void setDateIn(String dateIn) {
		this.dateIn = dateIn;
	}

	public String getDateOut() {
		return dateOut;
	}

	public void setDateOut(String dateOut) {
		this.dateOut = dateOut;
	}

	public Formule getFormule() {
		return formule;
	}

	public void setFormule(Formule formule) {
		this.formule = formule;
	}
	
	
	
	
	
}
