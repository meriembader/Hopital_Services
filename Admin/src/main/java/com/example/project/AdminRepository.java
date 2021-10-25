package com.example.project;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
	@Query("select c from Admin c where c.nom like :nom")
	public Page<Admin> adminByNom(@Param("nom") String n, Pageable pageable);
}
