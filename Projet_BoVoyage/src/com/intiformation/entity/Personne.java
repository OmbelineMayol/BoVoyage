package com.intiformation.entity;

public abstract class Personne {
	
	//Déclaration des attributs
	private int idPersonne;
	private int civilite;
	private String nom;
	private String prenom;
	private int age;
	private String adresse;
	private String telephone;
	private String email;
	
	
	
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
