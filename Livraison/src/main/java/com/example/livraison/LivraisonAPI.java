package com.example.livraison;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;




@RestController
public class LivraisonAPI {

	@Autowired
	LivraisonService serv;
	
	@GetMapping("/GetUser")
	public ResponseEntity<String> sayTest() {
		final String uri = "http://192.168.99.100:3000/users/5dccf6dbef5b25001e2a565b";
	     
	    RestTemplate restTemplate = new RestTemplate();
	     
	    HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
	     
	    ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);
	     
	    return result;
	}

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
	
	@PutMapping(value="/{id}" ,produces = MediaType.APPLICATION_JSON_VALUE)
	public Livraison updateEntrepot(@PathVariable(value="id") int id, @RequestBody Livraison newEntrepot) {
		return serv.updateLivraison(id, newEntrepot);
	}
	
}
