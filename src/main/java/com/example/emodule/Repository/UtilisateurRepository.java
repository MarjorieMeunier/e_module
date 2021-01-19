package com.example.emodule.Repository;

import com.example.emodule.model.Utilisateur;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

@EnableJpaRepositories
public interface UtilisateurRepository extends CrudRepository<Utilisateur, Integer> {

}