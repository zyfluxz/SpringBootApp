package com.example.produit;



import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categorie implements Serializable {
	
	@Id
	@GeneratedValue
	private int id;
	private String nom;
	@OneToMany
	private List<Produit> prodList;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public List<Produit> getProdList() {
		return prodList;
	}
	public void setProdList(List<Produit> prodList) {
		this.prodList = prodList;
	}
	
	
	public Categorie(int id, String nom, List<Produit> prodList) {
		super();
		this.id = id;
		this.nom = nom;
		this.prodList = prodList;
	}
	public Categorie() {
		super();
	}
	
	
	
}
