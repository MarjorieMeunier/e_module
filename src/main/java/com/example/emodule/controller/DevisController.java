package com.example.emodule.controller;

import com.example.emodule.model.*;
import com.example.emodule.model.Module;
import com.example.emodule.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    private IComposantService composantService;

    @Autowired
    private IClientService clientService;

    @RequestMapping( value = {"/creerDevis"}, method = RequestMethod.GET )
    public String creerDevis( Model model) throws Exception {

        List<FamilleComposant> familleComposants = familleComposantService.getListFamilleComposant();
        model.addAttribute("familleComposants", familleComposants);

        List<Module> moduleList = moduleService.findAll();
        model.addAttribute("modules", moduleList);

       for (int i = 0; i < familleComposants.size(); i++){
            System.out.println("Famille composant : "+familleComposants.get(i).getNom_famille_composant());

            List<Module> m = familleComposants.get(i).getModules();

            for (int a = 0; a < m.size(); a++){
                System.out.println(familleComposants.get(i).relationModule(m.get(a).getId_module()));
                System.out.println("Module relié a la famille : "+m.get(a).getNature_module());
            }
           System.out.println(" ");
       }

        return "creerDevis";
    }


    //recupere la liste des composants selon la famille de composant choisi
    @RequestMapping(value = "/composants", method = RequestMethod.GET)
    @ResponseBody
    public List<Composant> getRegions(@RequestParam Integer id_famille_composant) {

        System.out.println(id_famille_composant);
        List<Composant> composants = composantService.getListComposants(id_famille_composant);

        for (int i = 0; i < composants.size(); i++){
            System.out.println("Composant : "+ composants.get(i).getNature_composant());
        }

        return composants;
    }

    //recupere la liste des composants selon la famille de composant choisi
    @RequestMapping(value = "/clientNomPrenom", method = RequestMethod.GET)
    @ResponseBody
    public List<Client> getListeClient(@RequestParam String nomPrenom) {

        System.out.println(nomPrenom);
        List<Client> clients = clientService.getListClientNotDeleteWithNomPrenom(nomPrenom);

        for (int i = 0; i < clients.size(); i++){
            System.out.println("client : "+ clients.get(i).getNom_client() +" "+clients.get(i).getPrenom_client());
        }

        return clients;
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
