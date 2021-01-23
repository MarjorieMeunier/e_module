package com.example.emodule.Repository;


import com.example.emodule.model.Client;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@EnableJpaRepositories
public interface ClientRepository extends CrudRepository<Client, Integer> {

    @Transactional()
    @Query("select c from Client c where c.flag = 0")
    public List<Client> getListClientNotDelete();

    @Transactional()
    @Query("select c from Client c where c.flag = 0 and concat(c.nom_client,' ',c.prenom_client) like %:nomPrenom% OR concat(c.prenom_client,' ',c.nom_client) LIKE %:nomPrenom%")
    public List<Client> getListClientNotDeleteWithNomPrenom(String nomPrenom);
}
