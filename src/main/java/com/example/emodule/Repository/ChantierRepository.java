package com.example.emodule.Repository;

import com.example.emodule.model.Chantier;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
public interface ChantierRepository extends CrudRepository<Chantier, Long> {

}
