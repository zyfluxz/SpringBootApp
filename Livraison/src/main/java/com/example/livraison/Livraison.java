package com.example.livraison;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Livraison implements Serializable{
	
	@Id
	@GeneratedValue
	private int id;
	private String etatlivraison;
	private Livreur livreur;
	private String fournisseur;
	private String commande;
	private int nbcommandes;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEtatlivraison() {
		return etatlivraison;
	}
	public void setEtatlivraison(String etatlivraison) {
		this.etatlivraison = etatlivraison;
	}
	public Livreur getLivreur() {
		return livreur;
	}
	public void setLivreur(Livreur livreur) {
		this.livreur = livreur;
	}
	public String getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
	}
	public String getCommande() {
		return commande;
	}
	public void setCommande(String commande) {
		this.commande = commande;
	}
	public int getNbcommandes() {
		return nbcommandes;
	}
	public void setNbcommandes(int nbcommandes) {
		this.nbcommandes = nbcommandes;
	}
	@Override
	public String toString() {
		return "Livraison [id=" + id + ", etatlivraison=" + etatlivraison + ", livreur=" + livreur + ", fournisseur="
				+ fournisseur + ", commande=" + commande + ", nbcommandes=" + nbcommandes + "]";
	}
	public Livraison(int id, String etatlivraison, Livreur livreur, String fournisseur, String commande,
			int nbcommandes) {
		super();
		this.id = id;
		this.etatlivraison = etatlivraison;
		this.livreur = livreur;
		this.fournisseur = fournisseur;
		this.commande = commande;
		this.nbcommandes = nbcommandes;
	}
	public Livraison() {
		super();
	}
	
	
	
}
