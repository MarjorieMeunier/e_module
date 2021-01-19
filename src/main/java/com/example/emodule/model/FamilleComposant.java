package com.example.emodule.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="famille_composant")
public class FamilleComposant implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_famille_composant", nullable=false)
    private Integer id_famille_composant;

    @Column(name="nom_famille_composant")
    private String nom_famille_composant;

    public void setId_famille_composant(Integer id_famille_composant) {
        this.id_famille_composant = id_famille_composant;
    }

    public void setNom_famille_composant(String nom_famille_composant) {
        this.nom_famille_composant = nom_famille_composant;
    }

    public Integer getId_famille_composant() {
        return id_famille_composant;
    }

    public String getNom_famille_composant() {
        return nom_famille_composant;
    }
}
