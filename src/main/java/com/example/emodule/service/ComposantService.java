package com.example.emodule.service;

import com.example.emodule.Repository.ComposantRepository;
import com.example.emodule.model.Composant;
import com.example.emodule.model.FamilleComposant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ComposantService implements IComposantService {
    @Autowired
    private ComposantRepository repository;

    @Override
    public List<Composant> getListComposants(Integer id_famille_composant) {
        return (List<Composant>) repository.getListComposants(id_famille_composant);
    }
}
