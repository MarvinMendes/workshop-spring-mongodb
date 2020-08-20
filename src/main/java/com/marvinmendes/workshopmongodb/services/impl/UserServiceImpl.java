package com.marvinmendes.workshopmongodb.services.impl;

import com.marvinmendes.workshopmongodb.domain.User;
import com.marvinmendes.workshopmongodb.repository.UserRepository;
import com.marvinmendes.workshopmongodb.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }
}
