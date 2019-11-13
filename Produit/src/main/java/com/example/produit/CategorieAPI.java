package com.example.produit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategorieAPI {

	@Autowired
	CategorieService serv;
	
	@GetMapping("/Categorie/all")
	public List<Categorie> getAllCategories(){
		return serv.getAllCategories();
	}
	
	
	@PostMapping("/Categorie/add")
	public Categorie addCategorie(@RequestBody Categorie cat) {
		return serv.addCategorie(cat);
	}
	
	@GetMapping(value="/Categorie/{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
	public Categorie getCategorieById(@PathVariable(value="id") int id) {
		return serv.getCategorieById(id);
	}
	
	@GetMapping(value="/Categorie/ByNom/{nom}" ,produces = MediaType.APPLICATION_JSON_VALUE)
	public Categorie getCategorieByNom(@PathVariable(value="nom") String nom) {
		return serv.getCategorieByNom(nom);
	}
	
	
	@DeleteMapping(value="/Categorie/{id}" ,produces = MediaType.TEXT_PLAIN_VALUE)
	public String deleteCategorieById(@PathVariable(value="id") int id) {
		return serv.deleteCategorieById(id);
	}
	
	
	
	@PutMapping(value="/Categorie/{id}" ,produces = MediaType.APPLICATION_JSON_VALUE)
	public Categorie updaCategorie(@PathVariable(value="id") int id, @RequestBody Categorie cat) {
		return serv.updateCategorie(id, cat);
	}

}
