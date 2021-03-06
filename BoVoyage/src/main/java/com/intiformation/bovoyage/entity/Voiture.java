package com.intiformation.bovoyage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;



@Entity(name = "voiture")
@Table(name = "voitures")
@XmlRootElement
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

	@Column(name= "photo")
	private String photo;

	// Transformation de l'association UML en java
//	@OneToOne(mappedBy="voitureFormule")
//	private Formule formule;

	// Déclaration des constructeurs
	public Voiture() {
		super();
	}

	
	public Voiture(String categorie, String loueur, String photo) {
		super();
		this.categorie = categorie;
		this.loueur = loueur;
		this.photo = photo;
		
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

//	public Formule getFormule() {
//		return formule;
//	}
//
//	public void setFormule(Formule formule) {
//		this.formule = formule;
//	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}
	

}
