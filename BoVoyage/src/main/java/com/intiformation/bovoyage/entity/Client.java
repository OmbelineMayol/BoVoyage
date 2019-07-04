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



@Entity(name= "client")
@Table(name= "clients")
public class Client {

	// Déclaration des attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_client")
	protected int idClient;
	
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
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "numCB")
	private double numCB;
	
	@Column(name = "actived")
	private int actived;

	// ----- Transformation de l'association UML en java
	@OneToOne(mappedBy="client")
	private Role role;
	
	@OneToMany(mappedBy="client")
	private List<Accompagnant> listeAccompagnants; 
	
	@OneToOne(mappedBy="client")
	private Reservation reservation;

	// ----- Déclaration des constructeurs
	public Client() {
		super();
	}

	public Client(int civilite, String nom, String prenom, int age, String adresse, String telephone, String email,
			String password, double numCB, int actived, Role role, List<Accompagnant> listeAccompagnants,
			Reservation reservation) {
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
		this.actived = actived;
		this.role = role;
		this.listeAccompagnants = listeAccompagnants;
		this.reservation = reservation;
	}
	// ----- Déclaration des getters et setters

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
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
