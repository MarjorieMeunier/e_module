package com.example.emodule.controller;

import com.example.emodule.model.Client;
import com.example.emodule.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class ClientController {

    @Autowired
    //instancie l'interface client
    private IClientService clientService;

    //Récupérer la liste des clients avec le flag 0 (non archivé)
    @RequestMapping(value = {"/listeClient"}, method = RequestMethod.GET)
    public String listeClient(Model model) throws Exception {
        List<Client> clients = clientService.getListClientNotDelete();
        model.addAttribute("clients", clients);
        return "listeClient";
    }

    //Formulaire création client avec un attribut un nouveau client
    @RequestMapping(value = {"/creerClient"}, method = RequestMethod.GET)
    public String modelCreerClient(Model model) {
        model.addAttribute("client", new Client());
        return "creerClient";
    }

    //Créer un client
    @PostMapping(value= {"/creerClient"})
    public String creerClient(@ModelAttribute("client") Client
                                    client, Model model, BindingResult bindingResult) {

        if(bindingResult.hasErrors()){
            return "creerClient";
        }

        clientService.addClient(client);
        // model.addAttribute("client", c);

        return "redirect:/listeClient";
    }

    //Formulaire de modification d'un client avec en paramètre l'id du client sélectionné
    @RequestMapping(value = {"/modifierClient/{id}"}, method = RequestMethod.GET)
    public String modelModifierClient(@PathVariable Integer id, Model model) {

        Optional<Client> c = clientService.findById(id);
        Client client = c.get();

        System.out.println("ID : " + client.getId_client());
        System.out.println("ID : " + client.getNom_client());
        model.addAttribute("client", client);
        return "modifierClient";
    }

    //Modification client avec l'attribut client de la méthode modifierClient()
    @PostMapping(value="/modifierClient/{id}")
    public String modifierClient(@PathVariable Integer id, @ModelAttribute("client") Client
            client){

        Optional<Client> c = clientService.findById(id);
        Client c1 = c.get();

        c1.setNom_client(client.getNom_client());
        c1.setPrenom_client(client.getPrenom_client());
        c1.setTelephone_client(client.getTelephone_client());
        c1.setMail_client(client.getMail_client());
        c1.setVille_client(client.getVille_client());
        c1.setCp_client(client.getCp_client());
        c1.setAdresse_client(client.getAdresse_client());

        clientService.addClient(c1);

        return "redirect:/listeClient";
    }

    //Archiver client avec en paramètre l'id du client sélectionné
    @PostMapping(value = "/archiverClient/{id}")
    public String archiverClient(@PathVariable Integer id, @ModelAttribute("client") Client client){
        System.out.println("POST");
        Optional<Client> c = clientService.findById(id);
        Client client1 = c.get();

        client1.setFlag(1);

        clientService.addClient(client1);

        return "redirect:/listeClient";
    }

    //Formulaire recherche client
    @RequestMapping(value = {"/rechercherClient"}, method = RequestMethod.GET)
    public String modelRechercherClient(Model model) {
        //model.addAttribute("client", new Client());
        return "rechercherClient";
    }

    //Archiver client avec en paramètre l'id du client sélectionné
    @PostMapping(value = "/rechercherClient")
    public String archiverClient(@ModelAttribute("client") Client client){
        System.out.println("POST");
       /* Optional<Client> c = clientService.findById(id);
        Client client1 = c.get();

        client1.setFlag(1);

        clientService.addClient(client1);*/

        return "redirect:/listeClient";
    }



}