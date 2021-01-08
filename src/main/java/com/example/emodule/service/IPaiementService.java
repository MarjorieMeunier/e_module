package com.example.emodule.service;

import com.example.emodule.model.Paiement;

import java.util.List;

public interface IPaiementService {
    List<Paiement> findAll();
}