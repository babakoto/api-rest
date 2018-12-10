package com.youngdev.apirest.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
public class Livre {
    @Column(name = "livre_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titreLivre;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "auteur_id")
    @JsonBackReference
    Auteur auteur;

    public Livre(String titreLivre, Auteur auteur) {
        this.titreLivre = titreLivre;
        this.auteur = auteur;
    }
}
