package com.example.demo.repository;

import com.example.demo.entities.Livre;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
public interface LivreRepository extends JpaRepository<Livre, Long> {
	 
}