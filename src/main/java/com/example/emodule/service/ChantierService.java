package com.example.emodule.service;

import com.example.emodule.DAO.ChantierDAO;
import com.example.emodule.model.Chantier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ChantierService {

    //Injection du DAO chantier
    @Autowired
    private ChantierDAO chantierDAO;


    public List<Chantier> getAllChantier(){
        return chantierDAO.findAll();
    }

    /*public Chantier getByName(String name){
        return chantierDAO.findByName(name);
    }*/
}
