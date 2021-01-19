package com.example.emodule.Repository;

import com.example.emodule.model.Module;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

@EnableJpaRepositories
public interface ModuleRepository extends CrudRepository<Module, Integer> {
}
