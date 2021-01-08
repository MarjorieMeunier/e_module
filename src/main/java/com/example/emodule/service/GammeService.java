package com.example.emodule.service;

import com.example.emodule.Repository.GammeRepository;
import com.example.emodule.model.Gamme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GammeService implements IGammeService{

    @Autowired
    private GammeRepository repository;

    @Override
    public List<Gamme> findAll() {
        return (List<Gamme>) repository.findAll();
    }
}