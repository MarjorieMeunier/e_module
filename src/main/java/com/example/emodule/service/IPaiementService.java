package com.example.emodule.service;

import com.example.emodule.model.Paiement;
import java.util.List;
import java.util.Optional;

public interface IPaiementService {

    List<Paiement> getListPaiementNotDelete();

    Optional<Paiement> findById(Integer id);

    Paiement addPaiement(Paiement paiement);
}
