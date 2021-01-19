package com.example.emodule.service;

import com.example.emodule.Repository.ChantierRepository;
import com.example.emodule.model.Chantier;
import com.example.emodule.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChantierService implements IChantierService{

    @Autowired
    private ChantierRepository repository;

    @Override
    public List<Chantier> getListChantierNotDelete() {
        return repository.getListChantierNotDelete();
    }

    @Override
    public Optional<Chantier> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Chantier addChantier(Chantier chantier){
        chantier.setFlag(0);
        return repository.save(chantier);
    }
}
