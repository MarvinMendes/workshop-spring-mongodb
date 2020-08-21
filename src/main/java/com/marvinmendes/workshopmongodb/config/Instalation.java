package com.marvinmendes.workshopmongodb.config;

import com.marvinmendes.workshopmongodb.domain.User;
import com.marvinmendes.workshopmongodb.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@RequiredArgsConstructor
public class Instalation implements CommandLineRunner {

    private final UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.deleteAll();

        User andre = new User(null, "André Ribeiro", "andreribeiro@gmail.com");
        User carlos = new User(null, "Carlos Eduardo", "caroloseduardo@gmail.com");
        User fernando = new User(null, "Fernando Torres", "fernandotorres@gmail.com");

        repository.saveAll(Arrays.asList(andre, carlos, fernando));

    }
}
