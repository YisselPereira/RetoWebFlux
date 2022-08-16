package com.sofka.yissel.retowebflux.repo;

import com.sofka.yissel.retowebflux.model.Client;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientRepo {
    Mono<Client> register(Client client);
    Mono<Client> modify(Client client);
    Flux<Client> findAll();
    Mono<Client> findById(Integer id);
    Mono<Void> remove(Integer id);
}
