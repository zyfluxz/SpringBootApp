package com.example.produit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategorieService {

	@Autowired
	CategorieRepository rep;
	
	@Autowired
	ProduitRepository repp;
	
	public Categorie addCategorie(Categorie cat) {
		return rep.save(cat);
	}
	
	public List<Categorie> getAllCategories(){
		return rep.findAll();
	}
	
	public Categorie getCategorieById(int id) {
		return rep.findById(id).get();
	}
	
	public Categorie getCategorieByNom(String nom) {
		return rep.getCategorieByNom(nom);
	}
	
	public String deleteCategorieById(int id) {
		if(rep.findById(id).isPresent()) {
			rep.delete(rep.findById(id).get());
			return "Categorie supprimé";
		}
		else {
			return "Categorie n'existe pas";
		}
	}
	
	
	public Categorie updateCategorie(int id,Categorie newProduit) {
		if(rep.findById(id).isPresent()) {
			Categorie existingProduit = rep.findById(id).get();
			if(newProduit.getNom() != null) {
				existingProduit.setNom(newProduit.getNom());
			}
			
			
			return rep.save(existingProduit);
		}else {
			return null;
		}
	}
}
