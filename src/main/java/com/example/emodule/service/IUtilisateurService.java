package com.example.emodule.service;

import com.example.emodule.model.Client;
import com.example.emodule.model.Utilisateur;
import java.util.List;
import java.util.Optional;

public interface IUtilisateurService {
    List<Utilisateur> findAll();
    Optional<Utilisateur> findById(Integer id);
}