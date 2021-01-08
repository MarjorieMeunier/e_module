package com.example.emodule.controller;

import com.example.emodule.model.Chantier;

import com.example.emodule.service.IChantierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ChantierController {

    //---- commentaire ------------------
    @RequestMapping( value = {"/"}, method = RequestMethod.GET )
    public String accueil(){
        return "accueil";
    }

    @Autowired
    //instancie l'interface chantier
    private IChantierService chantierService;

    //Récupérer la liste des chantiers
    //--------commentaire --------------
    @RequestMapping(value = {"/listeChantier"}, method = RequestMethod.GET)
    public String listeChantier(Model model) throws Exception{

        List<Chantier> chantiers = chantierService.findAll();

        model.addAttribute("chantiers", chantiers);

        return "listeChantier";
    }


}
