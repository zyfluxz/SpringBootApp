package com.example.livraison;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class LivraisonAPI {

	@Autowired
	LivraisonService serv;
	
	@GetMapping("/Livraison/all")
	public List<Livraison> getAllLivraison(){
		return serv.getAllLivraisons();
	}
	
	
	@PostMapping("/Livraison/add")
	public Livraison addLivraison(@RequestBody Livraison liv) {
		return serv.addLivraison(liv);
	}
	
	@GetMapping(value="/Livraison/{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
	public Livraison getLivraisonById(@PathVariable(value="id") int id) {
		return serv.getLivraisonById(id);
	}
	
	@GetMapping(value="/Livraison/ByFournisseur/{fournisseur}" ,produces = MediaType.APPLICATION_JSON_VALUE)
	public Livraison getLivraisonByNom(@PathVariable(value="fournisseur") String fournisseur) {
		return serv.getLivraisonByFournisseur(fournisseur);
	}
	
	
	@DeleteMapping(value="/Livraison/{id}" ,produces = MediaType.TEXT_PLAIN_VALUE)
	public String deleteLivraisonById(@PathVariable(value="id") int id) {
		return serv.deleteLivraisonById(id);
	}
	
	
	
}
