package com.intiformation.bovoyage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity(name = "banque")
@Table(name = "banques")
@XmlRootElement
public class Banque {

	/* ___________________ Attributs ________________________ */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_banque")
	private int idBanque;
	
	@Column(name = "nom")
	private String nomBanque;
	
	@Column(name = "numeroCB")
	private double numeroCB;
	
	@Column(name = "solde")
	private double solde;

	/* ___________________ Constructeurs ________________________ */
	public Banque() {
		super();
	}

	public Banque(String nomBanque, double numeroCB, double solde) {
		super();
		this.nomBanque = nomBanque;
		this.numeroCB = numeroCB;
		this.solde = solde;
	}

	/* ___________________ Getter & Setter ________________________ */

	public int getIdBanque() {
		return idBanque;
	}

	public void setIdBanque(int idBanque) {
		this.idBanque = idBanque;
	}

	public String getNomBanque() {
		return nomBanque;
	}

	public void setNomBanque(String nomBanque) {
		this.nomBanque = nomBanque;
	}

	public double getNumeroCB() {
		return numeroCB;
	}

	public void setNumeroCB(double numeroCB) {
		this.numeroCB = numeroCB;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

}
