package com.example.emodule.service;


import com.example.emodule.model.Client;
import java.util.List;
import java.util.Optional;

public interface IClientService {

    Client addClient(Client client);

    Optional<Client> findById(Integer id);

    List<Client> getListClientNotDelete();
}
