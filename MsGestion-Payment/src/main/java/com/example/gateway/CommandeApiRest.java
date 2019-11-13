package com.example.gateway;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@GetMapping
public List<Commande> getAllProduit(){
	return commandeService.getAllCommandes();
}
@PostMapping
public Commande addCommande(@RequestBody Commande commande) {
	return commandeService.addCommande(commande);
}


}
