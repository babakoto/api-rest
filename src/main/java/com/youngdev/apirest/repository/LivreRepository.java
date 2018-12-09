package com.youngdev.apirest.repository;

import com.youngdev.apirest.model.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivreRepository extends JpaRepository<Livre,Integer> {
    List<Livre> findAllByAuteur_Id(int id);
    List<Livre> getLivreByAuteur_Id(int id);
}
