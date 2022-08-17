package com.sofka.yissel.retowebflux.controller;

import com.sofka.yissel.retowebflux.model.Client;
import com.sofka.yissel.retowebflux.service.ClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/clients")
public class ClientController {
    private static final Logger log = LoggerFactory.getLogger(ClientController.class);

    @Autowired
    private ClientService service;
    @GetMapping
    public Flux<Client> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Client> findById(@PathVariable("id") Integer id){
        return service.findById(id);
    }

    @PostMapping
    public Mono<Client> register(@RequestBody Client client){
        return service.register(client);
    }

    @PutMapping
    public Mono<Client> modify(@RequestBody Client client){
        return service.modify(client);
    }
}
