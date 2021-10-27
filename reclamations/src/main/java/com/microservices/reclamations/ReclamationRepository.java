package com.microservices.reclamations;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ReclamationRepository extends JpaRepository<Reclamation,Long> {
	@Query("select m from Reclamation m where m.email like :email")
	public Page<Reclamation> reclamationByEmail(@Param("email") String n, Pageable pageable);
}
