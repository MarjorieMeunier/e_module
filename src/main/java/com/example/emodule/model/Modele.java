package com.example.emodule.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="modele")
public class Modele {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_modele", nullable=false)
    private Integer id_modele;

    @Column(name="libelle_modele")
    private String libelle_modele;

    @Column(name="finition")
    private String finition;

    //@JsonIgnore
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "modele_module",
            joinColumns = { @JoinColumn(name = "id_modele") },
            inverseJoinColumns = { @JoinColumn(name = "id_module") }
    )
    List<Module> modules;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_gamme", referencedColumnName = "id_gamme")
    private Gamme gamme;

    public Integer getId_modele() {
        return id_modele;
    }

    public void setId_modele(Integer id_modele) {
        this.id_modele = id_modele;
    }

    public String getLibelle_modele() {
        return libelle_modele;
    }

    public void setLibelle_modele(String libelle_modele) {
        this.libelle_modele = libelle_modele;
    }

    public String getFinition() {
        return finition;
    }

    public void setFinition(String finition) {
        this.finition = finition;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    public Gamme getGamme() {
        return gamme;
    }

    public void setGamme(Gamme gamme) {
        this.gamme = gamme;
    }
}
