package com.marvinmendes.workshopmongodb.services;

import com.marvinmendes.workshopmongodb.domain.User;
import com.marvinmendes.workshopmongodb.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }
}
