package com.example.emodule.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="gamme")
public class Gamme implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_gamme", nullable=false)
    private Integer id_gamme;

    @Column(name="libelle_gamme")
    private String libelle_gamme;

    public Integer getId_gamme() {
        return id_gamme;
    }

    public void setId_gamme(Integer id_gamme) {
        this.id_gamme = id_gamme;
    }

    public String getLibelle_gamme() {
        return libelle_gamme;
    }

    public void setLibelle_gamme(String libelle_gamme) {
        this.libelle_gamme = libelle_gamme;
    }
}
