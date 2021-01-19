package com.example.emodule.service;

import com.example.emodule.Repository.ChantierRepository;
import com.example.emodule.Repository.PaiementRepository;
import com.example.emodule.model.Chantier;
import com.example.emodule.model.Paiement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaiementService implements IPaiementService{

    @Autowired
    private PaiementRepository repository;

    @Override
    public List<Paiement> getListPaiementNotDelete() {
        return repository.getListPaiementNotDelete();
    }

    @Override
    public Optional<Paiement> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Paiement addPaiement(Paiement paiement){
        paiement.setFlag(0);
        return repository.save(paiement);
    }
}
