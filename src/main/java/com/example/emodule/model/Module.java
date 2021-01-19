package com.example.emodule.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="module")
public class Module {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_module", nullable=false)
    private Integer id_module;

    @Column(name="nature_module")
    private String nature_module;

    @Column(name="caracteristiques")
    private String caracteristiques;

    @ManyToMany(mappedBy = "modules")
    private List<FamilleComposant> familleComposants;

    public Integer getId_module() {
        return id_module;
    }

    public void setId_module(Integer id_module) {
        this.id_module = id_module;
    }

    public String getNature_module() {
        return nature_module;
    }

    public void setNature_module(String nature_module) {
        this.nature_module = nature_module;
    }

    public String getCaracteristiques() {
        return caracteristiques;
    }

    public void setCaracteristiques(String caracteristiques) {
        this.caracteristiques = caracteristiques;
    }

    public List<FamilleComposant> getFamilleComposants() {
        return familleComposants;
    }

    public void setFamilleComposants(List<FamilleComposant> familleComposants) {
        this.familleComposants = familleComposants;
    }
}
