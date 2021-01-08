package com.example.emodule.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DevisController {

    @RequestMapping( value = {"/creerDevis"}, method = RequestMethod.GET )
    public String creerDevis(){
        return "creerDevis";
    }
}
