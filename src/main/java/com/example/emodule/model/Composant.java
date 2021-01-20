package com.example.emodule.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="composant")
public class Composant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_composant", nullable=false)
    private Integer id_composant;

    @Column(name="nature_composant")
    private String nature_composant;

    @Column(name="caracteristiques")
    private String caracteristiques;

    @Column(name="prix")
    private float prix;

    @Column(name="unite_usage")
    private String unite_usage;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_fournisseur", referencedColumnName = "id_fournisseur")
    private Fournisseur fournisseur;

    public Integer getId_composant() {
        return id_composant;
    }

    public void setId_composant(Integer id_composant) {
        this.id_composant = id_composant;
    }

    public String getNature_composant() {
        return nature_composant;
    }

    public void setNature_composant(String nature_composant) {
        this.nature_composant = nature_composant;
    }

    public String getCaracteristiques() {
        return caracteristiques;
    }

    public void setCaracteristiques(String caracteristiques) {
        this.caracteristiques = caracteristiques;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getUnite_usage() {
        return unite_usage;
    }

    public void setUnite_usage(String unite_usage) {
        this.unite_usage = unite_usage;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    public FamilleComposant getFamilleComposant() {
        return familleComposant;
    }

    public void setFamilleComposant(FamilleComposant familleComposant) {
        this.familleComposant = familleComposant;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_famille_composant", referencedColumnName = "id_famille_composant")
    private FamilleComposant familleComposant;
}
