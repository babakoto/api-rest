package com.youngdev.apirest.controller;

import com.youngdev.apirest.model.Auteur;
import com.youngdev.apirest.repository.AuteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuteurController {
    @Autowired
    AuteurRepository auteurRepository;

    @PostMapping("/auteur/add")
    Auteur ajouter(@RequestBody Auteur auteur){
        return auteurRepository.save(auteur);
    }

}
