package com.sofka.yissel.retowebflux.service;

import com.sofka.yissel.retowebflux.model.Client;
import com.sofka.yissel.retowebflux.repo.ClientRepoMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientService {

    @Autowired
    private ClientRepoMongo repo;

    public Flux<Client> findAll(){
        return repo.findAll();
    }

    public Mono<Client> findById(Integer id){
        return repo.findById(id);
    }

    public Mono<Client> register(Client client){
        return repo.insert(client);
    }

    public Mono<Client> modify(Client client) {
        return repo.save(client);
    }
}
