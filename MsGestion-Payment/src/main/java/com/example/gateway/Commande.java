package com.example.gateway;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity

public class Commande implements Serializable {
	@Id
	@GeneratedValue
	private int id;
	private int total;
	@OneToOne
	private Payment payement;
	
	
	
	
	public Payment getPayement() {
		return payement;
	}
	public void setPayement(Payment payement) {
		this.payement = payement;
	}
	public Commande(int total, Payment payement, Boolean etat) {
		super();
		this.total = total;
		this.payement = payement;
		this.etat = etat;
	}
	public Commande(int total) {
		super();
		this.total = total;
	}
	private Boolean etat;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}

	public Boolean getEtat() {
		return etat;
	}
	public void setEtat(Boolean etat) {
		this.etat = etat;
	}
	public Commande(int id, int total, Boolean etat) {
		super();
		this.id = id;
		this.total = total;
		this.etat = etat;
	}
	public Commande(int total, Boolean etat) {
		super();
		this.total = total;
		this.etat = etat;
	}
	public Commande() {
		super();
	}
	

}
