package com.example.produit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Entrepot {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int id;
	private String lieu;
	private String rayon;
	private Double taille;
	
	public int getId() {
		return id;
	}
	public String getRayon() {
		return rayon;
	}
	public void setRayon(String rayon) {
		this.rayon = rayon;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public Double getTaille() {
		return taille;
	}
	public void setTaille(Double taille) {
		this.taille = taille;
	}
	public Entrepot(int id, String lieu, Double taille) {
		super();
		this.id = id;
		this.lieu = lieu;
		this.taille = taille;
	}
	@Override
	public String toString() {
		return "Entrepot [id=" + id + ", lieu=" + lieu + ", taille=" + taille + "]";
	}
	public Entrepot() {
		super();
	}
	
}
