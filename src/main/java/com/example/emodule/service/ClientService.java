package com.example.emodule.service;


import com.example.emodule.Repository.ClientRepository;
import com.example.emodule.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService implements IClientService{

    @Autowired
    private ClientRepository repository;

    @Override
    public List<Client> findAll() {
        return (List<Client>) repository.findAll();
    }

    @Override
    public Client addClient(Client client){
        return repository.save(client);
    }

    public void deleteClient(Integer idClient){
        repository.deleteById(idClient);
    }

    public Optional<Client> findById(Integer idClient){
        return repository.findById(idClient);
    }

}
