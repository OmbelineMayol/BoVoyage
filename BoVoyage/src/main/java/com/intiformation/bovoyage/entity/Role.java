package com.intiformation.bovoyage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sun.xml.ws.config.metro.parser.jsr109.String;

@Entity(name = "role")
@Table(name= "roles")
public class Role {
	
	//-----------Déclaration des attributs
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name= "id_role")
	private int idRole;
	
	@Column(name = "role")
	private String Role;
	
	//------------Transformation de l'association UML en java
	@ManyToOne
	@JoinColumn(name="agent_id", referencedColumnName="id_agent")
	private Agent agent;
	
	@OneToOne
	@JoinColumn(name="client_id", referencedColumnName="id_client")
	private Client client;
	
	//------------Déclaration des constructeurs
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
	
	//--------------- Déclaration des getters et setters
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
	public Agent getAgent() {
		return agent;
	}
	public void setAgent(Agent agent) {
		this.agent = agent;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
}
