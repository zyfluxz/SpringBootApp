package com.example.produit;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Produit implements Serializable{

	@Id
	@GeneratedValue
	private int id;
	private String nom;
	private float prix_vente,prix_achat;
	private String description;
	private int stock;
	private Categorie categorie;
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
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public float getPrix_vente() {
		return prix_vente;
	}
	public void setPrix_vente(float prix_vente) {
		this.prix_vente = prix_vente;
	}
	public float getPrix_achat() {
		return prix_achat;
	}
	public void setPrix_achat(float prix_achat) {
		this.prix_achat = prix_achat;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	@Override
	public String toString() {
		return "Produit [id=" + id + ", nom=" + nom + ", prix_vente=" + prix_vente + ", prix_achat=" + prix_achat
				+ ", description=" + description + ", stock=" + stock + "]";
	}
	public Produit(int id, String nom, float prix_vente, float prix_achat, String description,int stock,Categorie categorie) {
		super();
		this.id = id;
		this.nom = nom;
		this.prix_vente = prix_vente;
		this.prix_achat = prix_achat;
		this.description = description;
		this.stock=	stock;
		this.categorie= categorie;
	}
	public Produit() {
		super();
	}
	
}
