package com.example.emodule.service;

import com.example.emodule.Repository.EtatRepository;
import com.example.emodule.model.Etat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtatService implements IEtatService{

    @Autowired
    private EtatRepository repository;

    @Override
    public List<Etat> findAll() {
        return (List<Etat>) repository.findAll();
    }
}
