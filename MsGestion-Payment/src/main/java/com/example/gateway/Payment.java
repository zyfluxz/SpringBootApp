package com.example.gateway;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity

public class Payment  implements Serializable {
	@Id
	@GeneratedValue
	private int id;
	private String Description;
	private String origine;
	private float montant;
	
	private Commande commande;
	
	
	
	public Payment(String description, String origine, float montant, Commande commande) {
		super();
		Description = description;
		this.origine = origine;
		this.montant = montant;
		this.commande = commande;
	}
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Payment(int id, String description, String origine, float montant) {
		super();
		this.id = id;
		Description = description;
		this.origine = origine;
		this.montant = montant;
	}
	public Payment(String description, String origine, float montant) {
		super();
		Description = description;
		this.origine = origine;
		this.montant = montant;
	}
	public Payment() {
		super();
	}
	
	

}
