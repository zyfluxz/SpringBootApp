package com.example.gateway;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;



@Service
public class CommandeService {
	@Autowired
	private CommandeRepository commandeRepository;
	
	public Commande addCommande(Commande commande) {
		return commandeRepository.save(commande);
	}
	public List<Commande> getAllCommandes(){
		return commandeRepository.findAll();
	}
	
	public Commande getProduitById(int id) {
		return commandeRepository.findById(id).get();
	}
	
	public Commande getProduitByEtat(Boolean etat) {
		return commandeRepository.getCommandeByEtat(etat);
	}
	
	public String deleteProduitById(int id) {
		CrudRepository<Commande, Integer> produitRepository;
		if(commandeRepository.findById(id).isPresent()) {
			commandeRepository.delete(commandeRepository.findById(id).get());
			return "Produit supprimé";
		}
		else {
			return "Produit n'existe pas";
		}
	}
}
