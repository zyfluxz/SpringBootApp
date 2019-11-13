 package com.example.gateway;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;

@RestController
@RequestMapping("/commandes")
public class CommandeApiRest {
	@Autowired
	private CommandeRepository commandeRepository;
	@Autowired
	public CommandeService commandeService;
	

public List<Commande> hello () {
		return commandeRepository.findAll();
}

@GetMapping("/Getproduit")
public ResponseEntity<String> sayTest() {
	final String uri = "http://192.168.99.100:8181/1";
     
    RestTemplate restTemplate = new RestTemplate();
     
    HttpHeaders headers = new HttpHeaders();
    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
     
    ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);
     
    return result;
}


@GetMapping
public List<Commande> getAllProduit(){
	return commandeService.getAllCommandes();
}
@PostMapping
public Commande addCommande(@RequestBody Commande commande) {
	return commandeService.addCommande(commande);
}
@PostMapping(value="{idp}/{idc}" ,produces = MediaType.APPLICATION_JSON_VALUE)
public Commande AffectPaymentToCommande(@PathVariable(value="idp") int idp,@PathVariable(value="idc") int idc) {
	return commandeService.affectPayment(idp, idc);
}
@GetMapping(value="etat/{etat}" ,produces = MediaType.APPLICATION_JSON_VALUE)
public Commande getProduitByNom(@PathVariable(value="etat") Boolean etat) {
	return commandeService.getCommandeByEtat(etat);
}
@GetMapping(value="/{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
public Commande getProduitById(@PathVariable(value="id") int id) {
	return commandeService.getCommandeById(id);
}

@DeleteMapping(value="/{id}" ,produces = MediaType.TEXT_PLAIN_VALUE)
public String deleteCommandeById(@PathVariable(value="id") int id) {
	return commandeService.deleteCommandeById(id);
}

}
