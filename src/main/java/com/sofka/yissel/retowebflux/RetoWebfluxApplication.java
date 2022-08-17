package com.sofka.yissel.retowebflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableReactiveMongoRepositories
public class RetoWebfluxApplication {

    public static void main(String[] args) {
        SpringApplication.run(RetoWebfluxApplication.class, args);
    }

}
