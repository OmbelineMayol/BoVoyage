package com.intiformation.bovoyage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import com.sun.xml.ws.config.metro.parser.jsr109.String;

@Entity(name="personne")
@Table(name="personnes")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Personne {
	
	//Déclaration des attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_personne")
	protected int idPersonne;
	
	@Column(name = "civilite")
	protected int civilite;
	
	@Column(name = "nom")
	protected String nom;
	
	@Column(name = "prenom")
	protected String prenom;
	
	@Column(name = "age")
	protected int age;
	
	@Column(name = "adresse")
	protected String adresse;
	
	@Column(name = "telephone")
	protected String telephone;
	
	@Column(name = "email")
	protected String email;
	
	
	//Déclaration des constructeurs
	public Personne() {
		super();
	}
	public Personne(int civilite, String nom, String prenom, int age, String adresse, String telephone, String email) {
		super();
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.adresse = adresse;
		this.telephone = telephone;
		this.email = email;
	}
	public Personne(int idPersonne, int civilite, String nom, String prenom, int age, String adresse, String telephone,
			String email) {
		super();
		this.idPersonne = idPersonne;
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.adresse = adresse;
		this.telephone = telephone;
		this.email = email;
	}
	//Déclaration des getters et setters
	
	public int getIdPersonne() {
		return idPersonne;
	}
	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}
	public int getCivilite() {
		return civilite;
	}
	public void setCivilite(int civilite) {
		this.civilite = civilite;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
