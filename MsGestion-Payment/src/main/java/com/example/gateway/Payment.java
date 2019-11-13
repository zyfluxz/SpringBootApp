package com.example.gateway;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity

public class Payment {
	@Id
	@GeneratedValue
	private int id;
	private Date datePayment;
	private String Description;
	private String origine;
	private float montant;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDatePayment() {
		return datePayment;
	}
	public void setDatePayment(Date datePayment) {
		this.datePayment = datePayment;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getOrigine() {
		return origine;
	}
	public void setOrigine(String origine) {
		this.origine = origine;
	}
	public float getMontant() {
		return montant;
	}
	public void setMontant(float montant) {
		this.montant = montant;
	}
	public Payment(int id, Date datePayment, String description, String origine, float montant) {
		super();
		this.id = id;
		this.datePayment = datePayment;
		Description = description;
		this.origine = origine;
		this.montant = montant;
	}
	public Payment(Date datePayment, String description, String origine, float montant) {
		super();
		this.datePayment = datePayment;
		Description = description;
		this.origine = origine;
		this.montant = montant;
	}
	
	

}
