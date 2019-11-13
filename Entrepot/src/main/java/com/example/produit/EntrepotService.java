package com.example.produit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EntrepotService {

	@Autowired
	EntrepotRepository EntrepotRepository;
	
	
	
	public Entrepot addEntrepot(Entrepot Entrepot) {
		return EntrepotRepository.save(Entrepot);
	}
	
	public List<Entrepot> getAllEntrepot(){
		return EntrepotRepository.findAll();
	}
	
	public Entrepot getEntrepotById(int id) {
		return EntrepotRepository.findById(id).get();
	}
	
	public Entrepot getEntrepotByLieu(String lieu) {
		return EntrepotRepository.getEntrepotByLieu(lieu);
	}
	
	public List<Entrepot> getEntrepotByTaille() {
		return EntrepotRepository.getEntrepotByTaille();	
	}
	
	
	public String deleteEntrepotById(int id) {
		if(EntrepotRepository.findById(id).isPresent()) {
			EntrepotRepository.delete(EntrepotRepository.findById(id).get());
			return "Entrepot supprimé";
		}
		else {
			return "Entrepot n'existe pas";
		}
	}
	

	

}