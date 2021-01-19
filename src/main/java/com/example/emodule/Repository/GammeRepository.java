package com.example.emodule.Repository;

import com.example.emodule.model.Gamme;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

@EnableJpaRepositories
public interface GammeRepository extends CrudRepository<Gamme, Integer> {

}