package com.intiformation.bovoyage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity(name = "voiture")
@Table(name = "voitures")
public class Voiture {

	// Déclaration des attributs
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_voiture")
	private int idVoiture;
	
	@Column(name = "categorie")
	private String categorie;
	
	@Column(name= "loueur")
	private String loueur;

	// Transformation de l'association UML en java
	private Formule formule;

	// Déclaration des constructeurs
	public Voiture() {
		super();
	}

	public Voiture(String categorie, String loueur) {
		super();
		this.categorie = categorie;
		this.loueur = loueur;
	}

	public Voiture(int idVoiture, String categorie, String loueur) {
		super();
		this.idVoiture = idVoiture;
		this.categorie = categorie;
		this.loueur = loueur;
	}

	// Déclaration des getters et setters
	public int getIdVoiture() {
		return idVoiture;
	}

	public void setIdVoiture(int idVoiture) {
		this.idVoiture = idVoiture;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getLoueur() {
		return loueur;
	}

	public void setLoueur(String loueur) {
		this.loueur = loueur;
	}

	public Formule getFormule() {
		return formule;
	}

	public void setFormule(Formule formule) {
		this.formule = formule;
	}

}
