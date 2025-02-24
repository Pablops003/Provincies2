package com.pablo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "FRANQUICIA")

public class FRANQUICIA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @Column(nullable = false)
    String nom;
    @JsonIgnoreProperties("franquicia")
    @ManyToMany
    @JoinTable(
            name = "CIUDAD_FRANQUICIA",
            joinColumns =  @JoinColumn(name = "franquicia_id"),
            inverseJoinColumns = @JoinColumn(name = "ciudad_id")
    )
    List<Ciudad> ciudadList;

    public FRANQUICIA(){}

    public FRANQUICIA(long id, String nom, List<Ciudad> ciudadList) {
        this.id = id;
        this.nom = nom;
        this.ciudadList = ciudadList;
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
        this.nom = nom;
    }

    public List<Ciudad> getCiudadList() {
        return ciudadList;
    }

    public void setCiudadList(List<Ciudad> ciudadList) {
        this.ciudadList = ciudadList;
    }
}
