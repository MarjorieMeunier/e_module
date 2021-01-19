package com.example.emodule.service;

import com.example.emodule.model.Chantier;
import java.util.List;
import java.util.Optional;

public interface IChantierService {
    //List<Chantier> findAll();

    List<Chantier> getListChantierNotDelete();

    Optional<Chantier> findById(Integer id);

    Chantier addChantier(Chantier chantier);
}
