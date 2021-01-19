package com.example.emodule.controller;

import com.example.emodule.model.Chantier;
import com.example.emodule.model.Client;
import com.example.emodule.model.FamilleComposant;
import com.example.emodule.model.Module;
import com.example.emodule.service.IChantierService;
import com.example.emodule.service.IClientService;
import com.example.emodule.service.IFamilleComposantService;
import com.example.emodule.service.IModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Controller
public class DevisController {

    @Autowired
    //instancie l'interface chantier/devis
    private IChantierService devisService;

    @Autowired
    private IFamilleComposantService familleComposantService;

    @Autowired
    private IModuleService moduleService;


    @RequestMapping( value = {"/creerDevis"}, method = RequestMethod.GET )
    public String creerDevis( Model model) throws Exception {
      // System.out.println("ID MODULE " + id_module);
        List<FamilleComposant> familleComposants = familleComposantService.getListFamilleComposantCouverture(1);
        model.addAttribute("familleComposants", familleComposants);

        List<Module> moduleList = moduleService.findAll();
        model.addAttribute("modules", moduleList);
        System.out.println("MODULES : " + moduleList.size());

       /* for (int i = 0; i < familleComposants.size(); i++){
            System.out.println(familleComposants.get(i).getNom_famille_composant());
        }*/
        return "creerDevis";
    }

    //Récupérer la liste des devis
    @RequestMapping(value = {"/listeDevis"}, method = RequestMethod.GET)
    public String listeDevis(Model model) throws Exception {
        List<Chantier> devis = devisService.getListChantierNotDelete();
        model.addAttribute("devis", devis);
        return "listeDevis";
    }

    //Formulaire de modification d'un devis avec en paramètre l'id du devis sélectionné
    @RequestMapping(value = {"/modifierDevis/{id}"}, method = RequestMethod.GET)
    public String modelModifierDevis(@PathVariable Integer id, Model model) {

        Optional<Chantier> c = devisService.findById(id);
        Chantier chantier = c.get();

        System.out.println("ID : " + chantier.getId_chantier());
        model.addAttribute("devis", chantier);
        return "modifierDevis";
    }

    //Modification devis avec l'attribut devis de la méthode modelModifierDevis()
    @PostMapping(value="/modifierDevis/{id}")
    public String modifierDevis(@PathVariable Integer id, @ModelAttribute("devis") Chantier
            chantier){

        Optional<Chantier> c = devisService.findById(id);
        Chantier c1 = c.get();


        c1.setNom_chantier(chantier.getNom_chantier());
        c1.setDate_chantier(chantier.getDate_chantier());
        c1.setEtat(chantier.getEtat());
        c1.setGamme(chantier.getGamme());


        devisService.addChantier(c1);

        return "redirect:/listeDevis";
    }

    //Archiver devis avec en paramètre l'id du devis sélectionné
    @PostMapping(value = "/archiverDevis/{id}")
    public String archiverDevis(@PathVariable Integer id, @ModelAttribute("devis") Chantier chantier){
        System.out.println("POST");
        System.out.println("ID : " + id);
        Optional<Chantier> c = devisService.findById(id);
        Chantier chantier1 = c.get();

        chantier1.setFlag(1);

        devisService.addChantier(chantier1);

        return "redirect:/listeDevis";
    }
}
