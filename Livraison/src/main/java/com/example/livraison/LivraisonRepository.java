package com.example.livraison;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface LivraisonRepository extends JpaRepository<Livraison, Integer>{

	@Query(value = "SELECT * FROM Livraison p WHERE p.fournisseur = :fournisseur", nativeQuery = true)		
	public Livraison getLivraisonByFournisseur(@Param("fournisseur") String fournisseur);
}
