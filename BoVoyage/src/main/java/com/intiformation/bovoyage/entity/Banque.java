package com.intiformation.bovoyage.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "banque")
@Table(name = "banques")
public class Banque implements Serializable {

	/* ___________________ Attributs ________________________ */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_banque")
	private int idBanque;
	@Column(name = "nom")
	private String NomBanque;
	@Column(name = "numeroCB")
	private double NumeroCB;
	@Column(name = "solde")
	private double solde;

	/* ___________________ Constructeurs ________________________ */

	public Banque() {
	}

	public Banque(String nomBanque, double numeroCB, double solde) {
		NomBanque = nomBanque;
		numeroCB = numeroCB;
		this.solde = solde;
	}

	public Banque(int idBanque, String nomBanque, double numeroCB, double solde) {
		super();
		this.idBanque = idBanque;
		NomBanque = nomBanque;
		numeroCB = numeroCB;
		this.solde = solde;
	}

	/* ___________________ Méthodes ________________________ */

	/* ___________________ Getter & Setter ________________________ */

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

	public double getNumeroCB() {
		return NumeroCB;
	}

	public void setNumeroCB(double numeroCB) {
		NumeroCB = numeroCB;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

}
