package com.example.emodule.model;

import org.springframework.context.annotation.Bean;

import javax.persistence.*;


import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="chantier")
public class Chantier implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_chantier;

    @Column(name="nom_chantier")
    private String nom_chantier;

    @Column(name="date_chantier")
    private String date_chantier;

    public Chantier() {
    }

    public Chantier(Integer id_chantier, String nom_chantier, String date_chantier) {
        this.id_chantier = id_chantier;
        this.nom_chantier = nom_chantier;
        this.date_chantier = date_chantier;
    }

    public Integer getId_chantier() {
        return id_chantier;
    }

    public void setId_chantier(Integer id_chantier) {
        this.id_chantier = id_chantier;
    }

    public String getNom_chantier() {
        return nom_chantier;
    }

    public void setNom_chantier(String nom_chantier) {
        this.nom_chantier = nom_chantier;
    }

    public String getDate_chantier() {
        return date_chantier;
    }

    public void setDate_chantier(String date_chantier) {
        this.date_chantier = date_chantier;
    }

}
