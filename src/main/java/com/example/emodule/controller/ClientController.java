package com.example.emodule.controller;

import com.example.emodule.Repository.ClientRepository;
import com.example.emodule.model.Client;
import com.example.emodule.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ClientController {

    @RequestMapping(value = {"/formulaireClient"}, method = RequestMethod.GET)
    public String formulaireClient(Model model) {
        model.addAttribute("client", new Client());
        System.out.println("COUCOU");
        return "formulaireClient";
    }

    @Autowired
    //instancie l'interface client
    private IClientService clientService;

    @Autowired
    private ClientRepository clientRepository;

    //Récupérer la liste des clients
    /*@RequestMapping(value = {"/listeClient"}, method = RequestMethod.GET)
    public String listeClient(Model model) throws Exception {
        List<Client> clients = clientService.findAll();
        model.addAttribute("clients", clients);
        return "listeClient";
    }*/

    //Créer un client
    @PostMapping(value= {"/formulaireClient"})
    //@RequestMapping(value = {"/formulaireClient"}, method = RequestMethod.POST)
    public String addClient(@ModelAttribute("client") Client
                                        client, Model model, BindingResult bindingResult) {

        System.out.println("Client " +  client);
       /* if(bindingResult.hasErrors()){
            return "formulaireClient";
        }*/
        Client c = new Client();
        c.setNom_client(client.getNom_client());
        c.setPrenom_client(client.getPrenom_client());
        c.setAdresse_client(client.getAdresse_client());
        c.setCp_client(client.getCp_client());
        c.setVille_client(client.getVille_client());
        c.setMail_client(client.getMail_client());
        c.setTelephone_client(client.getTelephone_client());

        System.out.println("Client " +  c);

       clientService.addClient(c);
      // model.addAttribute("client", c);

        return "listeClient";
    }

}