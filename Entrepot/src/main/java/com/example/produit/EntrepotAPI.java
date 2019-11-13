package com.example.produit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class EntrepotAPI {
	
	@Autowired
	public EntrepotService prodService;
	@RequestMapping("/hello")
	public String sayHello() {
		return "hello";
	}
	
	
	@GetMapping("/all")
	public List<Entrepot> getAllEntrepot(){
		return prodService.getAllEntrepot();
	}
	
	
	@PostMapping
	public Entrepot addEntrepot(@RequestBody Entrepot Entrepot) {
		return prodService.addEntrepot(Entrepot);
	}
	
	@GetMapping(value="/{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
	public Entrepot getEntrepotById(@PathVariable(value="id") int id) {
		return prodService.getEntrepotById(id);
	}
	
	@GetMapping(value="ByNom/{lieu}" ,produces = MediaType.APPLICATION_JSON_VALUE)
	public Entrepot getEntrepotByNom(@PathVariable(value="nom") String lieu) {
		return prodService.getEntrepotByLieu(lieu);
	}
	
	
	
	@DeleteMapping(value="/{id}" ,produces = MediaType.TEXT_PLAIN_VALUE)
	public String deleteEntrepotById(@PathVariable(value="id") int id) {
		return prodService.deleteEntrepotById(id);
	}
	
	


}
