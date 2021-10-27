package com.microservices.reclamations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReclamationService {
	@Autowired
	private ReclamationRepository reclamationRepository;
	
	public List<Reclamation> getAllReclamation()
	{
		return reclamationRepository.findAll();
	}
	public Reclamation addReclamation(Reclamation reclamation) {
		return reclamationRepository.save(reclamation);
	}
	public Reclamation updateReclamation(Long id, Reclamation newReclamation) {
		if(reclamationRepository.findById(id).isPresent()) {
			Reclamation existingReclamation = reclamationRepository.findById(id).get();
			existingReclamation.setDesc(newReclamation.getDesc());
			existingReclamation.setEmail(newReclamation.getEmail());
			return reclamationRepository.save(existingReclamation);
		} else
			return null;
	}
	
	public String deleteReclamation(Long id) {
		if(reclamationRepository.findById(id).isPresent()) {
			reclamationRepository.deleteById(id);
			return "Reclamation supprimer";
		} else
			return "Reclamation non supprimer";
	}

}

