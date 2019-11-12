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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class ProduitAPI {
	
	@Autowired
	public ProduitService prodService;
	@RequestMapping("/hello")
	public String sayHello() {
		return "hello";
	}
	
	
	@GetMapping("/all")
	public List<Produit> getAllProduit(){
		return prodService.getAllProduit();
	}
	
	@GetMapping("/SansStock")
	public List<Produit> getProduitStockEpuise(){
		return prodService.getProduitStockEpuise();
	}
	
	@PostMapping
	public Produit addProduit(@RequestBody Produit produit) {
		return prodService.addProduit(produit);
	}
	
	@GetMapping(value="/{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
	public Produit getProduitById(@PathVariable(value="id") int id) {
		return prodService.getProduitById(id);
	}
	
	@GetMapping(value="ByNom/{nom}" ,produces = MediaType.APPLICATION_JSON_VALUE)
	public Produit getProduitByNom(@PathVariable(value="nom") String nom) {
		return prodService.getProduitByNom(nom);
	}
	
	@GetMapping(value="ByNom" ,produces = MediaType.APPLICATION_JSON_VALUE)
	public Produit getProduitByNom2(@Param(value="nom") String nom) {
		return prodService.getProduitByNom(nom);
	}
	
	@DeleteMapping(value="/{id}" ,produces = MediaType.TEXT_PLAIN_VALUE)
	public String deleteProduitById(@PathVariable(value="id") int id) {
		return prodService.deleteProduitById(id);
	}
	
	/*@PostMapping(value="/addProduitToStock" , produces = MediaType.APPLICATION_JSON_VALUE)
	public Stock addProduitToStock(@Param(value="idP") int idP , @Param(value="idS") int idS) {
		return produitService.addProduitToStock(idP, idS);
	}
	*/
	
	@PutMapping(value="/{id}" ,produces = MediaType.APPLICATION_JSON_VALUE)
	public Produit updateProduit(@PathVariable(value="id") int id, @RequestBody Produit produit) {
		return prodService.updateProduit(id, produit);
	}


}
