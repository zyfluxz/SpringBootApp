package com.example.produit;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface EntrepotRepository extends JpaRepository<Entrepot, Integer> {
	
	@Query(value = "SELECT * FROM Entrepot p WHERE p.lieu = :lieu", nativeQuery = true)		
	public Entrepot getEntrepotByLieu(@Param("lieu") String nom);
	
	@Query(value = "SELECT * FROM Entrepot p WHERE p.taille = 0", nativeQuery = true)		
	public List<Entrepot> getEntrepotByTaille();
}
