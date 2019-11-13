package com.example.livraison;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Livreur implements Serializable{
	
	@Id
	@GeneratedValue
	private int id;
	private String nom;
	private String prenom;
	private double telephone;
	private String adresse;
	@OneToMany
	private List<Livraison> listLivraisons;
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
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public double getTelephone() {
		return telephone;
	}
	public void setTelephone(double telephone) {
		this.telephone = telephone;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public List<Livraison> getListLivraisons() {
		return listLivraisons;
	}
	public void setListLivraisons(List<Livraison> listLivraisons) {
		this.listLivraisons = listLivraisons;
	}
	
	
	@Override
	public String toString() {
		return "Livreur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", telephone=" + telephone + ", adresse="
				+ adresse + ", listLivraisons=" + listLivraisons + "]";
	}
	
	public Livreur(int id, String nom, String prenom, double telephone, String adresse,
			List<Livraison> listLivraisons) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.adresse = adresse;
		this.listLivraisons = listLivraisons;
	}
	public Livreur() {
		super();
	}
	
	
}
