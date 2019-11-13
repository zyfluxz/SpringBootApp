package com.example.gateway;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
	@Query(value = "SELECT * FROM Payement p WHERE p.montant = :montant", nativeQuery = true)		
	public Payment getPaymentByMontant(@Param("montant") float montant);
}
