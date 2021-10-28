package com.microservices.medicaments;


import java.util.List;

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
@RequestMapping(value = "/api/medicaments/")
public class MedicamentRestAPI {
	
	@Autowired
	private MedicamentService medicamentService;

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<List<Medicament>> getAllMedicament() {
		return new ResponseEntity<>(medicamentService.getAllMedicament(), HttpStatus.OK);	
	}

	@GetMapping("{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Medicament> getMedicamentById(@PathVariable ("id") int id) {
		return new ResponseEntity<>(medicamentService.getMedicamentById(id), HttpStatus.OK);	
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Medicament> createMedicament(@RequestBody Medicament medicament) {
		return new ResponseEntity<>(medicamentService.addMedicament(medicament), HttpStatus.OK);	
	}
	@PutMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Medicament> updateMedicament(@PathVariable(value = "id") int id, @RequestBody Medicament medicament){
		return new ResponseEntity<>(medicamentService.updateMedicament(id, medicament), HttpStatus.OK);
	}
	@DeleteMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> deleteMedicament(@PathVariable(value = "id") int id) {
		return new ResponseEntity<>(medicamentService.deleteMedicament(id), HttpStatus.OK);
	}
}
