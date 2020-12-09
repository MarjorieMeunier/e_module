package com.example.emodule.controller;

import com.example.emodule.model.Chantier;
import com.example.emodule.service.ChantierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ChantierController {


    @Autowired
    private ChantierService chantierService;





    @RequestMapping( value = {"/"}, method = RequestMethod.GET )
    public String accueil(){
        return "accueil";
    }

    //Récupérer la liste des chantiers
    @RequestMapping(value = {"/listeChantier"}, method = RequestMethod.GET)
    public String listeChantier(Model model){

        List<Chantier> chantiers = chantierService.getAllChantier();

        model.addAttribute("chantiers", chantiers);

        return "listeChantier";
    }


}
