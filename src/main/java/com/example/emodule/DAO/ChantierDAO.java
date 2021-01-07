package com.example.emodule.DAO;

import com.example.emodule.model.Chantier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChantierDAO extends JpaRepository<Chantier, Integer> {

    //Chantier findByName(String name);


}
