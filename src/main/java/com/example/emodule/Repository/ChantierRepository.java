package com.example.emodule.Repository;

import com.example.emodule.model.Chantier;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChantierRepository extends CrudRepository<Chantier, Long> {

}
