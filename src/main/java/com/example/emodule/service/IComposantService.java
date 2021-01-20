package com.example.emodule.service;

import com.example.emodule.model.Composant;

import java.util.List;

public interface IComposantService {

    List<Composant> getListComposants(Integer id_famille_composant);
}
