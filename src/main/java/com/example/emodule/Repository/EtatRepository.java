package com.example.emodule.Repository;

import com.example.emodule.model.Etat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatRepository extends CrudRepository<Etat, Long> {

}