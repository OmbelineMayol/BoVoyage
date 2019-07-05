package com.intiformation.bovoyage.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity(name = "agent")
@Table(name = "agents") //nom table dans la bdd
@XmlRootElement
public class Agent {

	//Déclaration des attributs
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name= "id_agent")
	private int idAgent;
	
	@Column(name= "username")
	private String username;
	
	@Column(name= "password")
	private String password;
	
	@Column(name= "actived")
	private int actived;
	
		

	//Déclaration des constructeurs
	
	public Agent() {
		super();
	}
	public Agent(String username, String password, int actived) {
		super();
		this.username = username;
		this.password = password;
		this.actived = actived;
	}
	
	
	//Déclaration des getters et setters
	
	public int getIdAgent() {
		return idAgent;
	}
	public void setIdAgent(int idAgent) {
		this.idAgent = idAgent;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getActived() {
		return actived;
	}
	public void setActived(int actived) {
		this.actived = actived;
	}
	
	
	
	
}
