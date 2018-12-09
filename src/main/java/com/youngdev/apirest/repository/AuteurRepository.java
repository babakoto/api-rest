package com.youngdev.apirest.repository;

import com.youngdev.apirest.model.Auteur;
import com.youngdev.apirest.model.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuteurRepository extends JpaRepository<Auteur,Integer> {
}
