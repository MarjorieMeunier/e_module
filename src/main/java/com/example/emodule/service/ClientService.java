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
    public Client addClient(Client client){
        client.setFlag(0);
        return repository.save(client);
    }

    public Optional<Client> findById(Integer idClient){

        return repository.findById(idClient);
    }

    public List<Client> getListClientNotDelete(){
        return repository.getListClientNotDelete();
    }

    public List<Client> getListClientNotDeleteWithNomPrenom(String nomPrenom){
        return repository.getListClientNotDeleteWithNomPrenom(nomPrenom);
    }

}
