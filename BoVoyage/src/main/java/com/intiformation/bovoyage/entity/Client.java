package com.intiformation.bovoyage.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonManagedReference;



@Entity(name= "client")
@Table(name= "clients")
@XmlRootElement
public class Client {

	// Déclaration des attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_client")
	protected int idClient;
	
	@Column(name = "civilite")
	protected String civilite;
	
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
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "numCB")
	private double numCB;
	

	// ----- Transformation de l'association UML en java
//	

//	@OneToMany(mappedBy="client")
//	private List<Accompagnant> listeAccompagnants; 
//	
//
//	@OneToOne(mappedBy="client")
//	private Reservation reservation;

	// ----- Déclaration des constructeurs
	public Client() {
		super();
	}
	
	public Client(String civilite, String nom, String prenom, int age, String adresse, String telephone, String email,
			String password, double numCB) {
		super();
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.adresse = adresse;
		this.telephone = telephone;
		this.email = email;
		this.password = password;
		this.numCB = numCB;
	}

	


	// ----- Déclaration des getters et setters

	
	public int getIdClient() {
		return idClient;
	}

	
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	
	public String getCivilite() {
		return civilite;
	}


	public void setCivilite(String civilite) {
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

	
	

//	public List<Accompagnant> getListeAccompagnants() {
//		return listeAccompagnants;
//	}
//
//	public void setListeAccompagnants(List<Accompagnant> listeAccompagnants) {
//		this.listeAccompagnants = listeAccompagnants;
//	}
//
//	public Reservation getReservation() {
//		return reservation;
//	}
//
//	public void setReservation(Reservation reservation) {
//		this.reservation = reservation;
//	}
	
	
	
	
	

}
