package com.sofka.yissel.retowebflux.repo;

import com.sofka.yissel.retowebflux.model.Client;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepoMongo extends ReactiveMongoRepository<Client, Integer> {
}
