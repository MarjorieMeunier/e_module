package com.example.emodule.Repository;

import com.example.emodule.model.Paiement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaiementRepository extends CrudRepository<Paiement, Long> {

}