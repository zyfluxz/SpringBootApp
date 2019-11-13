package com.example.livraison;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LivreurRepository extends JpaRepository<Livreur, Integer> {

	@Query(value = "SELECT * FROM Livreur p WHERE p.nom = :nom", nativeQuery = true)		
	public Livreur getLivreurByNom(@Param("nom") String nom);
}
