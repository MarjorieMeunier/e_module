package com.example.emodule.model;



import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="paiement")
public class Paiement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_paiement", nullable=false)
    private Integer id_paiement;

    @Column(name="libelle_etape")
    private String libelle_etape;

    @Column(name="pourcentage_etape")
    private Integer pourcentage_etape;

    @Column(name="flag")
    private Integer flag;

    public Integer getId_paiement() {
        return id_paiement;
    }

    public void setId_paiement(Integer id_paiement) {
        this.id_paiement = id_paiement;
    }

    public String getLibelle_etape() {
        return libelle_etape;
    }

    public void setLibelle_etape(String libelle_etape) {
        this.libelle_etape = libelle_etape;
    }

    public Integer getPourcentage_etape() {
        return pourcentage_etape;
    }

    public void setPourcentage_etape(Integer pourcentage_etape) {
        this.pourcentage_etape = pourcentage_etape;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}
