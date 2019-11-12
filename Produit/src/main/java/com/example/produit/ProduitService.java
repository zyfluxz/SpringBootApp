package com.example.produit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProduitService {

	@Autowired
	ProduitRepository produitRepository;
	
	
	
	public Produit addProduit(Produit produit) {
		return produitRepository.save(produit);
	}
	
	public List<Produit> getAllProduit(){
		return produitRepository.findAll();
	}
	
	public Produit getProduitById(int id) {
		return produitRepository.findById(id).get();
	}
	
	public Produit getProduitByNom(String nom) {
		return produitRepository.getProduitByNom(nom);
	}
	
	public List<Produit> getProduitStockEpuise() {
		return produitRepository.getProduitStockEpuise();	
	}
	
	
	public String deleteProduitById(int id) {
		if(produitRepository.findById(id).isPresent()) {
			produitRepository.delete(produitRepository.findById(id).get());
			return "Produit supprimé";
		}
		else {
			return "Produit n'existe pas";
		}
	}
	
/*	public Stock addProduitToStock(int idP,int idS) {
		Produit produit = produitRepository.findById(idP).get();
		Stock stock = stockRepository.findById(idS).get();
		stock.getListProduit().add(produit);
		return stockRepository.save(stock);
		
	} */
	
	public Produit updateProduit(int id,Produit newProduit) {
		if(produitRepository.findById(id).isPresent()) {
			Produit existingProduit = produitRepository.findById(id).get();
			if(newProduit.getNom() != null) {
				existingProduit.setNom(newProduit.getNom());
			}
			if(newProduit.getPrix_vente() != 0) {
				existingProduit.setPrix_vente(newProduit.getPrix_vente());
			}
			
			
			return produitRepository.save(existingProduit);
		}else {
			return null;
		}
	}

}