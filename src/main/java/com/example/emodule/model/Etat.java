package com.example.emodule.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="etat")
public class Etat implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_etat", nullable=false)
    private Integer id_etat;

    @Column(name="libelle_etat")
    private String libelle_etat;

    public Integer getId_etat() {
        return id_etat;
    }

    public void setId_etat(Integer id_etat) {
        this.id_etat = id_etat;
    }

    public String getLibelle_etat() {
        return libelle_etat;
    }

    public void setLibelle_etat(String libelle_etat) {
        this.libelle_etat = libelle_etat;
    }
}
