package com.youngdev.apirest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
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
    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "auteur")
    List<Livre> livres;

    public Auteur(String name, List<Livre> livres) {
        this.name = name;
        this.livres = livres;
    }
}
