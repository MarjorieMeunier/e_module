package com.example.emodule.Repository;

import com.example.emodule.model.Chantier;
import com.example.emodule.model.Paiement;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

@EnableJpaRepositories
public interface PaiementRepository extends CrudRepository<Paiement, Integer> {

    @Transactional()
    @Query("select p from Paiement p where p.flag = 0")
    public List<Paiement> getListPaiementNotDelete();

}
