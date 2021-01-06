package com.example.emodule.DAO;

import com.example.emodule.model.Chantier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChantierDAO extends JpaRepository<Chantier, Integer> {

    //Chantier findByName(String name);

    List<Chantier> findAll();


}
