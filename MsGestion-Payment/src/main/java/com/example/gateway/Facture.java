package com.example.gateway;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity

public class Facture {
	@Id
	@GeneratedValue
	private int id;
	private Date date;
	private String Description;
	private Boolean etat;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Boolean getEtat() {
		return etat;
	}
	public void setEtat(Boolean etat) {
		this.etat = etat;
	}

	public Facture(int id, Date date, String description, Boolean etat) {
		super();
		this.id = id;
		this.date = date;
		Description = description;
		this.etat = etat;
	}
	public Facture(Date date, String description, Boolean etat) {
		super();
		this.date = date;
		Description = description;
		this.etat = etat;
	}
	public Facture() {
		super();
	}
	
}
