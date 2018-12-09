package com.youngdev.apirest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Data
@Entity
@Table(name = "auteur")
public class Auteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "auteur_id")
    private int id;
    private String name;
    public Auteur(String name) {
        this.name = name;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "auteur")
    List<Livre> livres;

    public Auteur(String name, List<Livre> livres) {
        this.name = name;
        this.livres = livres;
    }
}
