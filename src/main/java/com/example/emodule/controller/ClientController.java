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


    @RequestMapping(value = {"/creerClient"}, method = RequestMethod.GET)
    public String creerClient(Model model) {
        model.addAttribute("client", new Client());
        return "creerClient";
    }

    //Créer un client
    @PostMapping(value= {"/creerClient"})
    public String addClient(@ModelAttribute("client") Client
                                    client, Model model, BindingResult bindingResult) {

        if(bindingResult.hasErrors()){
            return "creerClient";
        }

        clientService.addClient(client);
        // model.addAttribute("client", c);

        return "redirect:/listeClient";
    }

    @RequestMapping(value = {"/modifierClient/{id}"}, method = RequestMethod.GET)
    public String modifierClient(@PathVariable Integer id, Model model) {

        Optional<Client> c = clientService.findById(id);
        Client client = c.get();

        System.out.println("ID : " + client.getId_client());
        System.out.println("ID : " + client.getNom_client());
        model.addAttribute("client", client);
        return "modifierClient";
    }

    @RequestMapping(value = {"/archiverClient/{id}"}, method = RequestMethod.GET)
    public String archiveClient(@PathVariable Integer id, Model model) {

        Optional<Client> c = clientService.findById(id);
        Client client = c.get();

        System.out.println("ID : " + client.getId_client());
        System.out.println("ID : " + client.getNom_client());
        model.addAttribute("client", client);
        return "modalArchiveClient";
    }



    //Récupérer la liste des clients
    @RequestMapping(value = {"/listeClient"}, method = RequestMethod.GET)
    public String listeClient(Model model) throws Exception {
        List<Client> clients = clientService.findAll();
        model.addAttribute("clients", clients);
        return "listeClient";
    }


    //Suppression client
    @DeleteMapping(value = "/listeClient/{id}")
    public String deleteClient(@PathVariable Integer id){
         clientService.deleteClient(id);

       // if(!isRemoved){
           // return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       // }

        return "redirect:/listeClient";
    }

    //Modification client
    @PostMapping(value="/modifierClient/{id}")
    public String updateClient(@PathVariable Integer id, @ModelAttribute("client") Client
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

}