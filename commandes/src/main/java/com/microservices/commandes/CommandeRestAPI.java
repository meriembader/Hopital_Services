package com.microservices.commandes;
import java.util.Collection;
import java.util.List;

import com.microservices.commandes.models.Commande;
import com.microservices.commandes.models.CommandeDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api/commandes/")
public class CommandeRestAPI {

	@Autowired
	private CommandeService commandeService;


	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<List<Commande>> getAllCommande() {
		return new ResponseEntity<>(commandeService.getAllCommande(), HttpStatus.OK);	
	}

	@GetMapping({"{id}"})
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<CommandeDTO> getCommandeById(@PathVariable ("id") int id) {
		return new ResponseEntity<>(commandeService.getCommandeById(id), HttpStatus.OK);	
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Commande> createCommande(@RequestBody Commande commande) {
		return new ResponseEntity<>(commandeService.addCommande(commande), HttpStatus.OK);	
	}
	@PutMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Commande> updateCommande(@PathVariable(value = "id") int id, @RequestBody Commande commande){
		return new ResponseEntity<>(commandeService.updateCommande(id, commande), HttpStatus.OK);
	}
	@DeleteMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> deleteCommande(@PathVariable(value = "id") int id) {
		return new ResponseEntity<>(commandeService.deleteCommande(id), HttpStatus.OK);
	}


}
