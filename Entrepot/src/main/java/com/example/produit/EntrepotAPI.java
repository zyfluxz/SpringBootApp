package com.example.produit;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class EntrepotAPI {
	
	@Autowired
	public EntrepotService prodService;
	@RequestMapping("/hello")
	public String sayHello() {
		return "hello";
	}
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
	
	
	@PutMapping(value="/{id}" ,produces = MediaType.APPLICATION_JSON_VALUE)
	public Entrepot updateEntrepot(@PathVariable(value="id") int id, @RequestBody Entrepot newEntrepot) {
		return prodService.updateEntrepot(id, newEntrepot);
	}

}
