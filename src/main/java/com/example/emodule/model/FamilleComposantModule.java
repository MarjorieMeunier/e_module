package com.example.emodule.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="famille_composant_module")
public class FamilleComposantModule implements Serializable {

    @Id
    @Column(name="id_famille_composant", nullable=false)
    private Integer id_famille_composant;

    @Id
    @Column(name="id_module", nullable=false)
    private Integer id_module;

    public Integer getId_famille_composant() {
        return id_famille_composant;
    }

    public void setId_famille_composant(Integer id_famille_composant) {
        this.id_famille_composant = id_famille_composant;
    }

    public Integer getId_module() {
        return id_module;
    }

    public void setId_module(Integer id_module) {
        this.id_module = id_module;
    }

}
