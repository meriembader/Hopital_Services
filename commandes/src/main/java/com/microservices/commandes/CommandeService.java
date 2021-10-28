package com.microservices.commandes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.microservices.commandes.models.Commande;
import com.microservices.commandes.models.CommandeDTO;
import com.microservices.commandes.models.Medicament;

@Service
public class CommandeService {
	@Autowired
	private CommandeRepository commandeRepository;

	@Autowired
	private MedicamentFeignClient medicamentFeignClient;
	
	public List<Commande> getAllCommande() {
        return commandeRepository.findAll();
	}

	public CommandeDTO getCommandeById(int id) {
		Commande commande = commandeRepository.findById(id).orElseThrow();
		Medicament medicament = medicamentFeignClient.getMedicamentInfo(commande.getIdM());
		return new CommandeDTO(
			commande.getId(),
			commande.getName(),
			medicament,
			commande.getTotalQty(),
			commande.getTotalprice() );

	}

	public Commande addCommande(Commande commande) {
		return commandeRepository.save(commande);
	}
	public Commande updateCommande(int id, Commande newCommande) {
		if(commandeRepository.findById(id).isPresent()) {
			Commande existingCommande = commandeRepository.findById(id).get();
			existingCommande.setIdM(newCommande.getIdM());
			existingCommande.setName(newCommande.getName());
			existingCommande.setTotalprice(newCommande.getTotalprice());
			existingCommande.setTotalQty(newCommande.getTotalQty());
			return commandeRepository.save(existingCommande);
		} else
			return null;
	}
	
	public String deleteCommande(int id) {
		if(commandeRepository.findById(id).isPresent()) {
			commandeRepository.deleteById(id);
			return "Commande deleted";
		} else
			return "Commande not deleted";
	}

}

