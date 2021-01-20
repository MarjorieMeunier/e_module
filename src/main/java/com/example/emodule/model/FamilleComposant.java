package com.example.emodule.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="famille_composant")
public class FamilleComposant implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_famille_composant", nullable=false)
    private Integer id_famille_composant;

    @Column(name="nom_famille_composant")
    private String nom_famille_composant;

    @JsonIgnore
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "famille_composant_module",
            joinColumns = { @JoinColumn(name = "id_famille_composant") },
            inverseJoinColumns = { @JoinColumn(name = "id_module") }
    )
    List<Module> modules;

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

    public List<Module> getModules() {
        return modules;
    }

    public boolean relationModule(Integer id){

        for (int i = 0; i < modules.size(); i++){
            if (modules.get(i).getId_module().intValue() == id.intValue()){
                return true;
            }
        }

        return false;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }
}
