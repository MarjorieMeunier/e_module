package com.example.emodule.service;

import com.example.emodule.model.Utilisateur;
import java.util.List;

public interface IUtilisateurService {
    List<Utilisateur> findAll();
}