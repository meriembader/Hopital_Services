package com.microservices.Medical;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





@Service
public class MedicalService {
	@Autowired
	private MedicalRepository medicalRepository;
	
	public Medical addMedical(Medical medical) {
		return medicalRepository.save(medical);
	}
	public List<Medical> getAllMedical()
	{
		return medicalRepository.findAll();
	}
	
	public Medical updateMedical(int id, Medical newMedical) {
		if(medicalRepository.findById(id).isPresent()) {
			Medical existingMedical = medicalRepository.findById(id).get();
			existingMedical.setName(newMedical.getName());
			existingMedical.setLastname(newMedical.getLastname());
			existingMedical.setTraitement(newMedical.getTraitement());
			existingMedical.setMaladi(newMedical.getMaladi());
			existingMedical.setMedicament(newMedical.getMedicament());

			return medicalRepository.save(existingMedical);
		} else
			return null;
	}
	
	public String deleteMedical(int id) {
		if(medicalRepository.findById(id).isPresent()) {
			medicalRepository.deleteById(id);
			return "medical Deleted";
		} else
			return "medical not Deleted";
	}


}
