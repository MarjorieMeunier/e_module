package com.example.emodule.Repository;

import com.example.emodule.model.Chantier;

import com.example.emodule.model.Client;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

@EnableJpaRepositories
public interface ChantierRepository extends CrudRepository<Chantier, Integer> {

    @Transactional()
    @Query("select c from Chantier c where c.flag = 0")
    public List<Chantier> getListChantierNotDelete();

}
