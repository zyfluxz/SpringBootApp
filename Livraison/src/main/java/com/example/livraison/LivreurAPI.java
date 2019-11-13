package com.example.livraison;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivreurAPI {
	
	@Autowired
	LivreurService serv;
	
	@GetMapping("/Livreur/all")
	public List<Livreur> getAllLivreur(){
		return serv.getAllLivreurs();
	}
	
	
	@PostMapping("/Livreur/add")
	public Livreur addLivreur(@RequestBody Livreur liv) {
		return serv.addLivreur(liv);
	}
	
	@GetMapping(value="/Livreur/{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
	public Livreur getLivreurById(@PathVariable(value="id") int id) {
		return serv.getLivreurById(id);
	}
	
	@GetMapping(value="/Livreur/ByNom/{nom}" ,produces = MediaType.APPLICATION_JSON_VALUE)
	public Livreur getLivraisonByNom(@PathVariable(value="nom") String nom) {
		return serv.getLivreurByNom(nom);
	}
	
	
	@DeleteMapping(value="/Livreur/{id}" ,produces = MediaType.TEXT_PLAIN_VALUE)
	public String deleteLivreurById(@PathVariable(value="id") int id) {
		return serv.deleteLivreurById(id);
	}
	
	

}
