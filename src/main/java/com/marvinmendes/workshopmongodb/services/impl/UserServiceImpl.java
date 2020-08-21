package com.marvinmendes.workshopmongodb.services.impl;

import com.marvinmendes.workshopmongodb.DTO.UserDTO;
import com.marvinmendes.workshopmongodb.domain.User;
import com.marvinmendes.workshopmongodb.exception.ObjectNotFoundException;
import com.marvinmendes.workshopmongodb.repository.UserRepository;
import com.marvinmendes.workshopmongodb.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User getById(String id) {
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    @Override
    public User save(User user) {
        return repository.insert(user);
    }

    public User fromDto(UserDTO dto) {
        return new User(dto.getId(), dto.getName(), dto.getEmail());
    }
}
