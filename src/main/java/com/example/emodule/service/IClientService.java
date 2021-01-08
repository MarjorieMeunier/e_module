package com.example.emodule.service;


import com.example.emodule.model.Client;

import java.util.List;

public interface IClientService {
    List<Client> findAll();

    Client addClient(Client client);

}
