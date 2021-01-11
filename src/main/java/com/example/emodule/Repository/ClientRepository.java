package com.example.emodule.Repository;


import com.example.emodule.model.Client;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@EnableJpaRepositories
public interface ClientRepository extends CrudRepository<Client, Integer> {

   /* @Transactional()
    @Query("select c from Client c where c.id_client = :id")
    public Client findByIdClient(@Param("id") Integer id);*/


}
