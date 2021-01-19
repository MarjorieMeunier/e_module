package com.example.emodule.controller;

import com.example.emodule.model.Chantier;
import com.example.emodule.model.Paiement;
import com.example.emodule.service.IChantierService;
import com.example.emodule.service.IPaiementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class PaiementController {

    @Autowired
    //instancie l'interface chantier/devis
    private IPaiementService paiementService;


    //Récupérer la liste des devis
    @RequestMapping(value = {"/listePaiement"}, method = RequestMethod.GET)
    public String listePaiement(Model model) throws Exception {
        List<Paiement> paiements = paiementService.getListPaiementNotDelete();
        model.addAttribute("paiement", paiements);
        return "listePaiement";
    }

}
