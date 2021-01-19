package com.example.emodule.Repository;

import com.example.emodule.model.FamilleComposantModule;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

@EnableJpaRepositories
public interface FamilleComposantModuleRepository extends CrudRepository<FamilleComposantModule, Integer> {
}
