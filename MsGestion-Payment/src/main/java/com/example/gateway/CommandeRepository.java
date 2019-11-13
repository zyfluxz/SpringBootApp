package com.example.gateway;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CommandeRepository extends JpaRepository<Commande, Integer>{
	@Query(value = "SELECT * FROM Commande p WHERE p.etat = :etat", nativeQuery = true)		
	public Commande getCommandeByEtat(@Param("etat") Boolean etat);
}
