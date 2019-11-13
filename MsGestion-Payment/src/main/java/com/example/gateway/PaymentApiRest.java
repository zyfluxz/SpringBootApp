package com.example.gateway;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/payement")
public class PaymentApiRest {
	
	@Autowired
	private PaymentRepository payementrepository;
	@Autowired
	public PaymentService paymentservice;

	
	

public List<Payment> hello () {
		return payementrepository.findAll();
}
@GetMapping
public List<Payment> getAllPayments(){
	return paymentservice.getAllPayments();
}
@PostMapping
public Payment addPayement(@RequestBody Payment payment) {
	return paymentservice.addPayment(payment);
}
@GetMapping(value="montant/{montant}" ,produces = MediaType.APPLICATION_JSON_VALUE)
public Payment getPayementByMontant(@PathVariable(value="etat") float montant) {
	return paymentservice.getPaymentByMontant(montant);
}
@GetMapping(value="/{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
public Payment getPaymentById(@PathVariable(value="id") int id) {
	return paymentservice.getPaymentById(id);
}

@DeleteMapping(value="/{id}" ,produces = MediaType.TEXT_PLAIN_VALUE)
public String deletePaymentById(@PathVariable(value="id") int id) {
	return paymentservice.deletePaymentById(id);
}

@PutMapping(value="/{id}" ,produces = MediaType.APPLICATION_JSON_VALUE)
public Payment updateProduit(@PathVariable(value="id") int id, @RequestBody Payment newPyment) {
	return paymentservice.updatePayment(id, newPyment);
}
}
