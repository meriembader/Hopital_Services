package com.example.Commandes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api/commandes")
public class CommandeRestAPI {
	private String title = "Commande Microservice";
	@Autowired
	private CommandeService commandeService;
	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println(title);
		return title;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Commande> createCommande(@RequestBody Commande commande) {
		return new ResponseEntity<>(commandeService.addCommande(commande), HttpStatus.OK);	
	}
	@PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Commande> updateCommande(@PathVariable(value = "id") int id, @RequestBody Commande commande){
		return new ResponseEntity<>(commandeService.updateCommande(id, commande), HttpStatus.OK);
	}
	@DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> deleteCommande(@PathVariable(value = "id") int id) {
		return new ResponseEntity<>(commandeService.deleteCommande(id), HttpStatus.OK);
	}

}
