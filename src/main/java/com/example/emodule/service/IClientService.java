package com.example.emodule.service;


import com.example.emodule.model.Client;

import java.util.List;
import java.util.Optional;

public interface IClientService {

    List<Client> findAll();

    Client addClient(Client client);

    void deleteClient(Integer id);

    Optional<Client> findById(Integer id);
}
