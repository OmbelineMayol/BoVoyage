package com.intiformation.bovoyage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity(name="accompagnant")
@Table(name="accompagnants")
public class Accompagnant{
	
	/* -------------- DECLARATION DES ATTRIBUTS -----------------*/
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_accompagnant")
	protected int idAccommpagnant;
	
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
	
	
	/* -------------- ASSOCIATIONS UML -----------------*/
	
	
	@ManyToOne
	@JoinColumn(name="client_id", referencedColumnName="id_client")
	private Client client;


	/* -------------- DECLARATION DES CONSTRUCTEURS -----------------*/
	

	public Accompagnant() {
		super();
	}
		
	public Accompagnant(int civilite, String nom, String prenom, int age, String adresse, String telephone,
			String email, Client client) {
		super();
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.adresse = adresse;
		this.telephone = telephone;
		this.email = email;
		this.client = client;
	}

	/* ------------- GETTER ET SETTER -----------------*/
	
	public int getIdAccommpagnant() {
		return idAccommpagnant;
	}

	public void setIdAccommpagnant(int idAccommpagnant) {
		this.idAccommpagnant = idAccommpagnant;
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

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	
	




}
