package com.pablo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "PAIS")

public class PAIS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @Column(nullable = false)
    String nom;

    @JsonIgnoreProperties("pais_id")
    @OneToMany(mappedBy = "pais_id", cascade = CascadeType.ALL)
    private List<PROVINCIA> provincia;


    public PAIS(long id, String nom, List<PROVINCIA> provincias) {
        this.id = id;
        this.nom = nom;
        this.provincia=  provincias;
    }

    public PAIS() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        nom = nom;
    }

    public List<PROVINCIA> getProvincia() {
        return provincia;
    }

    public void setProvincia(List<PROVINCIA> provincia) {
        this.provincia = provincia;
    }
}
