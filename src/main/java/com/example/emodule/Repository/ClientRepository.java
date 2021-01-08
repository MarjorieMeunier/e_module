package com.example.emodule.Repository;


import com.example.emodule.model.Client;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

@EnableJpaRepositories
public interface ClientRepository extends CrudRepository<Client, Long> {

}
