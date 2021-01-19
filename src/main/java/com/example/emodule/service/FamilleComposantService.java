package com.example.emodule.service;

import com.example.emodule.Repository.EtatRepository;
import com.example.emodule.Repository.FamilleComposantRepository;
import com.example.emodule.model.Etat;
import com.example.emodule.model.FamilleComposant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamilleComposantService implements IFamilleComposantService{

    @Autowired
    private FamilleComposantRepository repository;

    @Override
    public List<FamilleComposant> getListFamilleComposantCouverture(Integer id_module) {
        return (List<FamilleComposant>) repository.getListFamilleComposantCouverture(id_module);
    }
}
