package com.example.emodule.Repository;

import com.example.emodule.model.Gamme;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GammeRepository extends CrudRepository<Gamme, Long> {

}