package com.example.emodule.model;

import javax.persistence.*;

import java.io.Serializable;
import java.util.List;


@Entity
@Table(name="chantier")
public class Chantier implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_chantier", nullable=false)
    private Integer id_chantier;

    @Column(name="nom_chantier")
    private String nom_chantier;

    @Column(name="date_chantier")
    private String date_chantier;

    @Column(name="flag")
    private Integer flag;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_utilisateur", referencedColumnName = "id_utilisateur")
    private Utilisateur utilisateur;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_paiement", referencedColumnName = "id_paiement")
    private Paiement paiement;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_etat", referencedColumnName = "id_etat")
    private Etat etat;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_gamme", referencedColumnName = "id_gamme")
    private Gamme gamme;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "devis_client",
            joinColumns = { @JoinColumn(name = "id_chantier") },
            inverseJoinColumns = { @JoinColumn(name = "id_client") }
    )
    List<Client> clients;

    public Chantier() {
    }

    public Chantier(Integer id_chantier, String nom_chantier, String date_chantier) {
        this.id_chantier = id_chantier;
        this.nom_chantier = nom_chantier;
        this.date_chantier = date_chantier;
    }

    public Integer getId_chantier() {
        return id_chantier;
    }

    public void setId_chantier(Integer id_chantier) {
        this.id_chantier = id_chantier;
    }

    public String getNom_chantier() {
        return nom_chantier;
    }

    public void setNom_chantier(String nom_chantier) {
        this.nom_chantier = nom_chantier;
    }

    public String getDate_chantier() {
        return date_chantier;
    }

    public void setDate_chantier(String date_chantier) {
        this.date_chantier = date_chantier;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Paiement getPaiement() {
        return paiement;
    }

    public void setPaiement(Paiement paiement) {
        this.paiement = paiement;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public Gamme getGamme() {
        return gamme;
    }

    public void setGamme(Gamme gamme) {
        this.gamme = gamme;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
