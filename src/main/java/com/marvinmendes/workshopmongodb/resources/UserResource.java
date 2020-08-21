package com.marvinmendes.workshopmongodb.resources;

import com.marvinmendes.workshopmongodb.DTO.UserDTO;
import com.marvinmendes.workshopmongodb.domain.User;
import com.marvinmendes.workshopmongodb.services.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/users")
public class UserResource {

    private final UserServiceImpl service;

    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll() {
        List<User> userList = service.findAll();
        List<UserDTO> userDTOS = userList.stream().map(user -> new UserDTO(user)).collect(Collectors.toList());
        return ResponseEntity.ok().body(userDTOS);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserDTO> getById(@PathVariable String id) {
        User user = service.getById(id);
        return ResponseEntity.ok().body(new UserDTO(user));
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody UserDTO dto) {
        User user = service.fromDto(dto);
        user = service.save(user);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @PutMapping
    public ResponseEntity<UserDTO> update(@RequestBody UserDTO dto) {
        User userUpdated = service.update(dto);
        return ResponseEntity.ok().body(new UserDTO(userUpdated));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
       service.delete(id);
       return ResponseEntity.noContent().build();
    }

}
