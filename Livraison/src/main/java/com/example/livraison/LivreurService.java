package com.example.livraison;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivreurService {

	@Autowired
	LivreurRepository rep;
	
	public Livreur addLivreur(Livreur cat) {
		return rep.save(cat);
	}
	
	public List<Livreur> getAllLivreurs(){
		return rep.findAll();
	}
	
	public Livreur getLivreurById(int id) {
		return rep.findById(id).get();
	}
	
	public Livreur getLivreurByNom(String nom) {
		return rep.getLivreurByNom(nom);
	}
	
	public String deleteLivreurById(int id) {
		if(rep.findById(id).isPresent()) {
			rep.delete(rep.findById(id).get());
			return "Livreur supprimé";
		}
		else {
			return "Livreur n'existe pas";
		}
	}
}
