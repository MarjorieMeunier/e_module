package com.example.emodule.service;

import com.example.emodule.Repository.PaiementRepository;
import com.example.emodule.model.Paiement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaiementService implements IPaiementService{

    @Autowired
    private PaiementRepository repository;

    @Override
    public List<Paiement> findAll() {
        return (List<Paiement>) repository.findAll();
    }
}