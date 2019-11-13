package com.example.gateway;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity

public class Commande {
	@Id
	@GeneratedValue
	private int id;
	private int total;
	public Commande(int total) {
		super();
		this.total = total;
	}
	private Date date;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Boolean getEtat() {
		return etat;
	}
	public void setEtat(Boolean etat) {
		this.etat = etat;
	}
	public Commande(int id, int total, Date date, Boolean etat) {
		super();
		this.id = id;
		this.total = total;
		this.date = date;
		this.etat = etat;
	}
	public Commande(int total, Date date, Boolean etat) {
		super();
		this.total = total;
		this.date = date;
		this.etat = etat;
	}
	public Commande() {
		super();
	}
	

}
