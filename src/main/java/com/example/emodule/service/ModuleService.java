package com.example.emodule.service;

import com.example.emodule.Repository.ModuleRepository;
import com.example.emodule.model.Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModuleService implements IModuleService{

    @Autowired
    private ModuleRepository repository;

    @Override
    public List<Module> findAll() {
        return (List<Module>) repository.findAll();
    }
}
