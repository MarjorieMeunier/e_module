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
public class AccueilController {

    //---- commentaire ------------------
    @RequestMapping( value = {"/"}, method = RequestMethod.GET )
    public String accueil(){
        return "accueil";
    }


}
