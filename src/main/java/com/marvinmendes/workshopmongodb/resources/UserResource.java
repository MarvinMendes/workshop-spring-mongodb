package com.marvinmendes.workshopmongodb.resources;

import com.marvinmendes.workshopmongodb.domain.User;
import com.marvinmendes.workshopmongodb.services.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/users")
public class UserResource {

    private final UserServiceImpl service;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> userList = service.findAll();
        return ResponseEntity.ok().body(userList);
    }
}
