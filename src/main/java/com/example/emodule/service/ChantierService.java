package com.example.emodule.service;

import com.example.emodule.Repository.ChantierRepository;
import com.example.emodule.model.Chantier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChantierService implements IChantierService{

    @Autowired
    private ChantierRepository repository;

    @Override
    public List<Chantier> findAll() {
        return (List<Chantier>) repository.findAll();
    }
}
