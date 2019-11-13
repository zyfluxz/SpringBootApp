package com.example.gateway;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class MsGestionPaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsGestionPaymentApplication.class, args);
	}
	@Bean
	ApplicationRunner init (CommandeRepository repository) {
		return args ->{Stream.of(25,77,88).forEach(nom->{repository.save(new Commande(nom));	});
		
		};
			

	}
	

}