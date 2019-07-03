package com.intiformation.bovoyage.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "formule")
@Table(name = "formules") 
public class Formule implements Serializable{
	
	
	/* _____________________ Déclaration des attributs ____________________ */
	
		@Id
		@GeneratedValue(strategy =  GenerationType.IDENTITY)
		@Column(name= "id_formule")
		private int idFormule;
		
		@Column(name= "DateDebut")
		private String dateDebut;
		
		@Column(name= "DateFin")
		private String dateFin;
		
		@Column(name= "Continent")
		private String continent;
		
		@Column(name= "Pays")
		private String pays;
		
		@Column(name= "Prix")
		private String prix;
		
		@Column(name= "Hebergement")
		private String hebergement;
		
		@Column(name= "NumeroAvion")
		private double numeroAvion;
		
		@Column(name= "PlacesDispo")
		private int placesDispo;

		/* _____________________ Constructeurs ____________________ */
		
		public Formule() {
		}

		public Formule(String dateDebut, String dateFin, String continent, String pays, String prix, String hebergement,
				double numeroAvion, int placesDispo) {
			super();
			this.dateDebut = dateDebut;
			this.dateFin = dateFin;
			this.continent = continent;
			this.pays = pays;
			this.prix = prix;
			this.hebergement = hebergement;
			this.numeroAvion = numeroAvion;
			this.placesDispo = placesDispo;
		}

		public Formule(int idFormule, String dateDebut, String dateFin, String continent, String pays, String prix,
				String hebergement, double numeroAvion, int placesDispo) {
			super();
			this.idFormule = idFormule;
			this.dateDebut = dateDebut;
			this.dateFin = dateFin;
			this.continent = continent;
			this.pays = pays;
			this.prix = prix;
			this.hebergement = hebergement;
			this.numeroAvion = numeroAvion;
			this.placesDispo = placesDispo;
		}


		/* _____________________ Méthodes ____________________ */
		
		
		
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
		

		
		
	
	
	

}
