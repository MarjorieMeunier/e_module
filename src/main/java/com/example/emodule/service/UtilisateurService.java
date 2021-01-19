package com.example.emodule.service;

import com.example.emodule.Repository.UtilisateurRepository;
import com.example.emodule.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurService implements IUtilisateurService{

    @Autowired
    private UtilisateurRepository repository;

    @Override
    public List<Utilisateur> findAll() {
        return (List<Utilisateur>) repository.findAll();
    }
}