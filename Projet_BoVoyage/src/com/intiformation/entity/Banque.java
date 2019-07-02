package com.intiformation.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="banque")
@Table(name="banques")
public class Banque implements Serializable{
	
	
	/* ___________________ Attributs Ici ________________________*/
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_banque")
	private int idBanque;
	@Column(name = "nom")
	String NomBanque;
	@Column(name = "numeroCB")
	double NumeroBanque;
	@Column(name = "solde")
	double solde;
	
	/* ___________________ Constructeurs ________________________*/
	
	public Banque() {
	}

	public Banque(String nomBanque, double numeroBanque, double solde) {
		NomBanque = nomBanque;
		NumeroBanque = numeroBanque;
		this.solde = solde;
	}



	public Banque(int idBanque, String nomBanque, double numeroBanque, double solde) {
		super();
		this.idBanque = idBanque;
		NomBanque = nomBanque;
		NumeroBanque = numeroBanque;
		this.solde = solde;
	}

	/* ___________________ Méthodes ________________________*/
	
	
	
	
	/* ___________________ Getter & Setter ________________________*/

	public int getIdBanque() {
		return idBanque;
	}



	public void setIdBanque(int idBanque) {
		this.idBanque = idBanque;
	}



	public String getNomBanque() {
		return NomBanque;
	}



	public void setNomBanque(String nomBanque) {
		NomBanque = nomBanque;
	}



	public double getNumeroBanque() {
		return NumeroBanque;
	}



	public void setNumeroBanque(double numeroBanque) {
		NumeroBanque = numeroBanque;
	}



	public double getSolde() {
		return solde;
	}



	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	
	
	
	
	
	
}
