package com.example.gateway;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PaymentService {
	@Autowired
	private PaymentRepository paymentRepository;
	
	public Payment addPayment(Payment payment) {
		return paymentRepository.save(payment);
	}
	public List<Payment> getAllPayments(){
		return paymentRepository.findAll();
	}
	
	public Payment getPaymentById(int id) {
		return paymentRepository.findById(id).get();
	}
	
	public Payment getPaymentByMontant(float montant) {
		return paymentRepository.getPaymentByMontant(montant);
	}
	
	public String deletePaymentById(int id) {
		if(paymentRepository.findById(id).isPresent()) {
			paymentRepository.delete(paymentRepository.findById(id).get());
			return "Payement supprimé";
		}
		else {
			return "Payement n'existe pas";
		}
	}
	public Payment updatePayment(int id,Payment newPyment) {
		if(paymentRepository.findById(id).isPresent()) {
			Payment existingPayment = paymentRepository.findById(id).get();
			if(newPyment.getMontant() != 0) {
				existingPayment.setMontant(newPyment.getMontant() );
			}
			if(newPyment.getOrigine() != null) {
				existingPayment.setOrigine(newPyment.getOrigine());
			}
			
			
			return paymentRepository.save(existingPayment);
		}else {
			return null;
		}
	}
}
