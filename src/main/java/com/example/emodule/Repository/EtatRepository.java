package com.example.emodule.Repository;

import com.example.emodule.model.Etat;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

@EnableJpaRepositories
public interface EtatRepository extends CrudRepository<Etat, Integer> {

}