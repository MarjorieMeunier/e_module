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
    @Query("SELECT fc FROM FamilleComposant fc")
    public List<FamilleComposant> getListFamilleComposantCouverture(Integer id_module);
}