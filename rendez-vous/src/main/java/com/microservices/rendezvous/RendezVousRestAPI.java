package com.microservices.rendezvous;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
@RequestMapping("/api/rendez-vous")
public class RendezVousRestAPI {

    @Autowired
    private RendezVousService rendezVousService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Set<RendezVous>> getAllRendezVous() {
        return new ResponseEntity<>(rendezVousService.getAllRendezVous(), HttpStatus.OK);
        
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
	public ResponseEntity<RendezVous> getRendezVousById(@PathVariable ("id") String id) {
        return new ResponseEntity<>(rendezVousService.getRendezVousById(id), HttpStatus.OK);
        
    }

    @PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<RendezVous> createRendezVous(@RequestBody RendezVous rendezVous) {
		return new ResponseEntity<>(rendezVousService.saveOrUodateRendezVous(rendezVous), HttpStatus.CREATED);	
	}

    @PutMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<RendezVous> updateRendezVous(@PathVariable ("id") String id, @RequestBody RendezVous rendezVous) {
        rendezVous.setId(id);
		return new ResponseEntity<>(rendezVousService.saveOrUodateRendezVous(rendezVous), HttpStatus.OK);	
	}

    @DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> deleteRendezVous(@PathVariable ("id") String id) {
        rendezVousService.deleteRendezVous(id);
		return new ResponseEntity<String>("Rendez-vous Deleted", HttpStatus.OK);	
	}



    
}
