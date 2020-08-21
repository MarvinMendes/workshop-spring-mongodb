package com.marvinmendes.workshopmongodb.services;

import com.marvinmendes.workshopmongodb.DTO.UserDTO;
import com.marvinmendes.workshopmongodb.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> findAll();
    User getById(String id);
    User save(User user);
    User update(UserDTO dto);
    void delete(String id);
}
