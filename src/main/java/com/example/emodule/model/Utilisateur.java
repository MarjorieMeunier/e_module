package com.example.emodule.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="utilisateur")
public class Utilisateur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_utilisateur", nullable=false)
    private Integer id_utilisateur;

    @Column(name="nom_utilisateur")
    private String nom_utilisateur;

    @Column(name="prenom_utilisateur")
    private String prenom_utilisateur;

    @Column(name="mail_utilisateur")
    private String mail_utilisateur;

    @Column(name="pwd_utilisateur")
    private String pwd_utilisateur;

    public Integer getId_utilisateur() {
        return id_utilisateur;
    }

    public void setId_utilisateur(Integer id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public String getNom_utilisateur() {
        return nom_utilisateur;
    }

    public void setNom_utilisateur(String nom_utilisateur) {
        this.nom_utilisateur = nom_utilisateur;
    }

    public String getPrenom_utilisateur() {
        return prenom_utilisateur;
    }

    public void setPrenom_utilisateur(String prenom_utilisateur) {
        this.prenom_utilisateur = prenom_utilisateur;
    }

    public String getMail_utilisateur() {
        return mail_utilisateur;
    }

    public void setMail_utilisateur(String mail_utilisateur) {
        this.mail_utilisateur = mail_utilisateur;
    }

    public String getPwd_utilisateur() {
        return pwd_utilisateur;
    }

    public void setPwd_utilisateur(String pwd_utilisateur) {
        this.pwd_utilisateur = pwd_utilisateur;
    }
}
