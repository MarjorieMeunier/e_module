package com.example.emodule.service;

import com.example.emodule.Repository.UtilisateurRepository;
import com.example.emodule.model.Client;
import com.example.emodule.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UtilisateurService implements IUtilisateurService{

    @Autowired
    private UtilisateurRepository repository;

    @Override
    public List<Utilisateur> findAll() {
        return (List<Utilisateur>) repository.findAll();
    }

    public Optional<Utilisateur> findById(Integer idUtilisateur){

        return repository.findById(idUtilisateur);
    }
}