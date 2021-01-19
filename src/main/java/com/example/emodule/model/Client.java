package com.example.emodule.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="client")
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_client", nullable=false)
    private Integer id_client;

    @Column(name="nom_client")
    private String nom_client;

    @Column(name="prenom_client")
    private String prenom_client;

    @Column(name="adresse_client")
    private String adresse_client;

    @Column(name="cp_client")
    private String cp_client;

    @Column(name="ville_client")
    private String ville_client;

    @Column(name="telephone_client")
    private Integer telephone_client;

    @Column(name="mail_client")
    private String mail_client;

    @Column(name="flag")
    private Integer flag;

    @ManyToMany(mappedBy = "clients")
    private List<Chantier> chantiers;


    public Integer getId_client() {
        return id_client;
    }

    public void setId_client(Integer id_client) {
        this.id_client = id_client;
    }

    public String getNom_client() {
        return nom_client;
    }

    public void setNom_client(String nom_client) {
        this.nom_client = nom_client;
    }

    public String getPrenom_client() {
        return prenom_client;
    }

    public void setPrenom_client(String prenom_client) {
        this.prenom_client = prenom_client;
    }

    public String getAdresse_client() {
        return adresse_client;
    }

    public void setAdresse_client(String adresse_client) {
        this.adresse_client = adresse_client;
    }

    public String getCp_client() {
        return cp_client;
    }

    public void setCp_client(String cp_client) {
        this.cp_client = cp_client;
    }

    public String getVille_client() {
        return ville_client;
    }

    public void setVille_client(String ville_client) {
        this.ville_client = ville_client;
    }

    public Integer getTelephone_client() {
        return telephone_client;
    }

    public void setTelephone_client(Integer telephone_client) {
        this.telephone_client = telephone_client;
    }

    public String getMail_client() {
        return mail_client;
    }

    public void setMail_client(String mail_client) {
        this.mail_client = mail_client;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public List<Chantier> getChantiers() {
        return chantiers;
    }

    public void setChantiers(List<Chantier> chantiers) {
        this.chantiers = chantiers;
    }
}
