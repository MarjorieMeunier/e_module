package com.example.emodule.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="fournisseur")
public class Fournisseur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_fournisseur", nullable=false)
    private Integer id_fournisseur;

    @Column(name="nom_fournisseur")
    private String nom_fournisseur;

    @Column(name="adresse_fournisseur")
    private String adresse_fournisseur;

    @Column(name="cp_fournisseur")
    private Integer cp_fournisseur;

    @Column(name="ville_fournisseur")
    private String ville_fournisseur;

    @Column(name="telephone_fournisseur")
    private Integer telephone_fournisseur;

    public Integer getId_fournisseur() {
        return id_fournisseur;
    }

    public void setId_fournisseur(Integer id_fournisseur) {
        this.id_fournisseur = id_fournisseur;
    }

    public String getNom_fournisseur() {
        return nom_fournisseur;
    }

    public void setNom_fournisseur(String nom_fournisseur) {
        this.nom_fournisseur = nom_fournisseur;
    }

    public String getAdresse_fournisseur() {
        return adresse_fournisseur;
    }

    public void setAdresse_fournisseur(String adresse_fournisseur) {
        this.adresse_fournisseur = adresse_fournisseur;
    }

    public Integer getCp_fournisseur() {
        return cp_fournisseur;
    }

    public void setCp_fournisseur(Integer cp_fournisseur) {
        this.cp_fournisseur = cp_fournisseur;
    }

    public String getVille_fournisseur() {
        return ville_fournisseur;
    }

    public void setVille_fournisseur(String ville_fournisseur) {
        this.ville_fournisseur = ville_fournisseur;
    }

    public Integer getTelephone_fournisseur() {
        return telephone_fournisseur;
    }

    public void setTelephone_fournisseur(Integer telephone_fournisseur) {
        this.telephone_fournisseur = telephone_fournisseur;
    }

    public String getMail_fournisseur() {
        return mail_fournisseur;
    }

    public void setMail_fournisseur(String mail_fournisseur) {
        this.mail_fournisseur = mail_fournisseur;
    }

    @Column(name="mail_fournisseur")
    private String mail_fournisseur;
}