package com.intiformation.bovoyage.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity(name = "formule")
@Table(name = "formules")
@XmlRootElement
public class Formule {

	/* _____________________ Déclaration des attributs ____________________ */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_formule")
	private int idFormule;

	@Column(name = "DateDebut")
	private String dateDebut;

	@Column(name = "DateFin")
	private String dateFin;

	@Column(name = "Continent")
	private String continent;

	@Column(name = "Pays")
	private String pays;

	@Column(name = "Prix")
	private String prix;

	@Column(name = "Hebergement")
	private String hebergement;

	@Column(name = "NumeroAvion")
	private double numeroAvion;

	@Column(name = "PlacesDispo")
	private int placesDispo;

	@Column(name = "Disponibilite")
	private int disponibilite;

	// Association UML en Java

//	@OneToMany(mappedBy = "formule")
//	private List<Reservation> listeReservation;
//
//	@OneToMany(mappedBy="formule")
//	private List<Hotel> hotelsFormule;
	
	@OneToOne
	@JoinColumn(name="voiture_id", referencedColumnName="id_voiture")
	private Voiture voitureFormule;

	/* _____________________ Constructeurs ____________________ */

	public Formule() {
	}

	public Formule(String dateDebut, String dateFin, String continent, String pays, String prix, String hebergement,
			double numeroAvion, int placesDispo, int disponibilite) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.continent = continent;
		this.pays = pays;
		this.prix = prix;
		this.hebergement = hebergement;
		this.numeroAvion = numeroAvion;
		this.placesDispo = placesDispo;
		this.disponibilite = disponibilite;
	}


	/* _____________________ Getter & Setter ____________________ */

	public int getIdFormule() {
		return idFormule;
	}

	public void setIdFormule(int idFormule) {
		this.idFormule = idFormule;
	}

	public String getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getPrix() {
		return prix;
	}

	public void setPrix(String prix) {
		this.prix = prix;
	}

	public String getHebergement() {
		return hebergement;
	}

	public void setHebergement(String hebergement) {
		this.hebergement = hebergement;
	}

	public double getNumeroAvion() {
		return numeroAvion;
	}

	public void setNumeroAvion(double numeroAvion) {
		this.numeroAvion = numeroAvion;
	}

	public int getPlacesDispo() {
		return placesDispo;
	}

	public void setPlacesDispo(int placesDispo) {
		this.placesDispo = placesDispo;
	}

//	public List<Hotel> getHotelsFormule() {
//		return hotelsFormule;
//	}
//
//	public void setHotelsFormule(List<Hotel> hotelsFormule) {
//		this.hotelsFormule = hotelsFormule;
//	}

	public Voiture getVoitureFormule() {
		return voitureFormule;
	}

	public void setVoitureFormule(Voiture voitureFormule) {
		this.voitureFormule = voitureFormule;
	}

	public int getDisponibilite() {
		return disponibilite;
	}

	public void setDisponibilite(int disponibilite) {
		this.disponibilite = disponibilite;
	}

//	public List<Reservation> getListeReservation() {
//		return listeReservation;
//	}
//
//	public void setListeReservation(List<Reservation> listeReservation) {
//		this.listeReservation = listeReservation;
//	}

}
