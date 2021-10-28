package com.microservices.rendezvous;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RendezVousService {

    @Autowired
    private RendezVousRepository rendezVousRepository;

    public Set<RendezVous> getAllRendezVous() {
        Set<RendezVous> rendezVousSet = new HashSet<>();
        rendezVousRepository.findAll().iterator().forEachRemaining(rendezVousSet::add);
        return rendezVousSet;
    }

    public RendezVous getRendezVousById(String id) {
        return rendezVousRepository.findById(id).orElseThrow();
    }

    public RendezVous saveOrUodateRendezVous (RendezVous rendezVous) {
        return rendezVousRepository.save(rendezVous);
    }

    public void deleteRendezVous (String id) {
        rendezVousRepository.deleteById(id);
    }

    
    
}
