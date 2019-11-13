package com.example.produit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CategorieRepository extends JpaRepository<Categorie, Integer>{

	@Query(value = "SELECT * FROM Categorie p WHERE p.nom = :nom", nativeQuery = true)		
	public Categorie getCategorieByNom(@Param("nom") String nom);
}

