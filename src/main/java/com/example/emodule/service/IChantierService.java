package com.example.emodule.service;

import com.example.emodule.model.Chantier;
import com.sun.xml.bind.v2.model.core.ID;

import java.util.List;

public interface IChantierService {

    List<Chantier> findAll();

}
