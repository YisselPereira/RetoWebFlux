package com.sofka.yissel.retowebflux.repo;

import com.sofka.yissel.retowebflux.model.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ClientRepoImpl implements ClientRepo{
    private static final Logger log = LoggerFactory.getLogger(ClientRepoImpl.class);
    List<Client> clients = new ArrayList<>();
    @Override
    public Mono<Client> register(Client client) {
        log.info(client.toString());
        clients.add(client);
        return Mono.just(client);
    }

    @Override
    public Mono<Client> modify(Client client) {
        log.info(client.toString());
        return Mono.just(client);
    }

    @Override
    public Flux<Client> findAll() {
        return Flux.fromIterable(clients);
    }

    @Override
    public Mono<Client> findById(Integer id) {
        return Mono.just(new Client(id, "Rocky"));
    }

    @Override
    public Mono<Void> remove(Integer id) {
        return Mono.empty();
    }
}
