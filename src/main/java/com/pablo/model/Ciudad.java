package com.pablo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@Table(name = "CIUDAD")

public class Ciudad {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
long id;
    @Column(nullable = false)
    String nom;
    private int poblacio;
    private String descripcio;
    private String imatge;
    @ManyToOne
    @JoinColumn(name = "provincia_id", nullable = false)
    @JsonIgnoreProperties("ciudades")// Evista la recursio infinita, No serialitzem el camp ciudades de Provincia

    private PROVINCIA provincia_id;


    public Ciudad(long id, String nom, int poblacio, String descripcio, String imatge, PROVINCIA provincia_id) {
        this.id = id;
        this.nom = nom;
        this.poblacio = poblacio;
        this.descripcio = descripcio;
        this.imatge = imatge;
        this.provincia_id = provincia_id;
    }

    public Ciudad() {}

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

    public PROVINCIA getProvincia_id() {
        return provincia_id;
    }

    public void setProvincia_id(PROVINCIA provincia_id) {
        this.provincia_id = provincia_id;
    }

    public int getPoblacio() {
        return poblacio;
    }

    public void setPoblacio(int poblacio) {
        this.poblacio = poblacio;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public String getImatge() {
        return imatge;
    }

    public void setImatge(String imatge) {
        this.imatge = imatge;
    }
}
