package com.example.emodule.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
@Controller
public class ConnexionController {

    //---- commentaire ------------------
    @RequestMapping( value = {"/connexion"}, method = RequestMethod.GET )
    public String connexion(){
        return "connexion";
    }
}
