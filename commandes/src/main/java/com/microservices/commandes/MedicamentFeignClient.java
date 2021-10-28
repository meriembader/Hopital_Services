package com.microservices.commandes;

import com.microservices.commandes.models.Medicament;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "medicaments-service")
public interface MedicamentFeignClient {

    @GetMapping("/api/medicaments/{id}")
    public Medicament getMedicamentInfo (@PathVariable ("id") int id);
    
}
