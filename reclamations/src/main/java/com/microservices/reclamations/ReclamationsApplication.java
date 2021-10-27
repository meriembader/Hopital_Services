package com.microservices.reclamations;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReclamationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReclamationsApplication.class, args);
	}
	
	@Bean
	ApplicationRunner init(ReclamationRepository repository) {
		return args -> {
			Stream.of("test@esprit.tn", "test2@esprit.tn", "test3@esprit.tn").forEach(email -> {
				repository.save(new Reclamation(email));
			});
			repository.findAll().forEach(System.out::println);
		};
	}

}
