package com.example.emodule.DAOImpl;

import com.example.emodule.DAO.ChantierDAO;
import com.example.emodule.model.Chantier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public abstract class ChantierDAOImpl implements ChantierDAO {

    public Chantier getByName(String name) {

        Chantier chantier= null;
        String sql = "SELECT * FROM chantier WHERE name_chantier = " + name;

        //chantier = getJdbcTemplate().query(sql, new Chantier());

        return chantier;
    }
}
