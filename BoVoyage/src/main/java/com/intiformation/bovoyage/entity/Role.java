package com.intiformation.bovoyage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.xml.ws.config.metro.parser.jsr109.String;

@Entity(name = "role")
@Table(name= "roles")
public class Role {
	
	//Déclaration des attributs
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name= "id_role")
	private int idRole;
	
	@Column(name = "role")
	private String Role;
	
	//Transformation de l'association UML en java
	private Agent agent;
	private Client client;
	
	//Déclaration des constructeurs
	public Role() {
		super();
	}
	public Role(String role) {
		super();
		Role = role;
	}
	public Role(int idRole, String role) {
		super();
		this.idRole = idRole;
		Role = role;
	}
	
	//Déclaration des getters et setters
	public int getIdRole() {
		return idRole;
	}
	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	
	
	
}
