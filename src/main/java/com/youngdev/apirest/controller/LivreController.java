package com.youngdev.apirest.controller;

import com.youngdev.apirest.exception.NotFoundException;
import com.youngdev.apirest.model.Auteur;
import com.youngdev.apirest.model.Livre;
import com.youngdev.apirest.repository.AuteurRepository;
import com.youngdev.apirest.repository.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LivreController {

    @Autowired
    private LivreRepository livreRepository;

    @Autowired
    private AuteurRepository auteurRepository;

    @PostMapping("/livre/{auteurID}/add")
    Livre ajouter(@PathVariable int auteurID, @RequestBody Livre livre){

        return auteurRepository.findById(auteurID)
                .map(auteur -> {
                    livre.setAuteur(auteur);
                    return livreRepository.save(livre);
                }
                ).orElseThrow( ()-> new NotFoundException("Not found"));
    }

    @GetMapping("/livres/{auteurId}/livre")
    List<Livre> listAllLivreByAuteur(@PathVariable int auteurId){
        return livreRepository.getLivreByAuteur_Id(auteurId);
    }
}
