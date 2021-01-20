package com.example.emodule.Repository;

import com.example.emodule.model.Composant;
import com.example.emodule.model.Etat;
import com.example.emodule.model.FamilleComposant;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

@EnableJpaRepositories
public interface ComposantRepository extends CrudRepository<Etat, Integer> {

    @Transactional()
    @Query("SELECT c FROM Composant c WHERE c.familleComposant.id_famille_composant =:id_famille_composant ")
    public List<Composant> getListComposants(Integer id_famille_composant);
}