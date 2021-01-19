package com.example.emodule.Repository;


import com.example.emodule.model.FamilleComposant;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

@EnableJpaRepositories
public interface FamilleComposantRepository extends CrudRepository<FamilleComposant, Integer> {

    @Transactional()
    @Query("SELECT fc FROM FamilleComposantModule fcm INNER JOIN fcm.id_famille_composant fc INNER JOIN fcm.id_module m WHERE fcm.id_module = 14")
    //SELECT fc FROM FamilleComposant fc INNER JOIN FamilleComposantModule fcm ON fc.id_famille_composant fcm.id_famille_composant WHERE fcm.id_module = 14
    public List<FamilleComposant> getListFamilleComposantCouverture();
}