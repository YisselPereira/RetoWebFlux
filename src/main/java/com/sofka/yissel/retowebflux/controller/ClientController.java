package com.sofka.yissel.retowebflux.controller;

import com.sofka.yissel.retowebflux.model.Client;
import com.sofka.yissel.retowebflux.repo.ClientRepo;
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
    private ClientRepo repo;
    @GetMapping
    public Flux<Client> findAll(){
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Client> findById(@PathVariable("id") Integer id){
        return repo.findById(id);
    }

    @PostMapping
    public Mono<Client> register(@RequestBody Client client){
        return repo.register(client);
    }

    @PutMapping
    public Mono<Client> modify(@RequestBody Client client){
        return repo.modify(client);
    }
}
