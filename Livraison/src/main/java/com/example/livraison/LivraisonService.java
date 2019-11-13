package com.example.livraison;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LivraisonService {

	@Autowired
	LivraisonRepository rep;
	
	public Livraison addLivraison(Livraison cat) {
		return rep.save(cat);
	}
	
	public List<Livraison> getAllLivraisons(){
		return rep.findAll();
	}
	
	public Livraison getLivraisonById(int id) {
		return rep.findById(id).get();
	}
	
	public Livraison getLivraisonByFournisseur(String fournisseur) {
		return rep.getLivraisonByFournisseur(fournisseur);
	}
	
	public String deleteLivraisonById(int id) {
		if(rep.findById(id).isPresent()) {
			rep.delete(rep.findById(id).get());
			return "Livraison supprimé";
		}
		else {
			return "Livraison n'existe pas";
		}
	}
	
	

}
