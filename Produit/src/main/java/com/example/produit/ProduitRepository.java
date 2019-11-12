package com.example.produit;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface ProduitRepository extends JpaRepository<Produit, Integer> {
	
	@Query(value = "SELECT * FROM Produit p WHERE p.nom = :nom", nativeQuery = true)		
	public Produit getProduitByNom(@Param("nom") String nom);
	
	@Query(value = "SELECT * FROM Produit p WHERE p.stock = 0", nativeQuery = true)		
	public List<Produit> getProduitStockEpuise();
}
