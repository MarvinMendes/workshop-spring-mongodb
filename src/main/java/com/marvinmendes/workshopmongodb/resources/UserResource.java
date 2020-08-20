package com.marvinmendes.workshopmongodb.resources;

import com.marvinmendes.workshopmongodb.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> findAll() {
        User gabriel = new User("1", "Gabriel Medeiros", "gabrielmedeiros@gmail.com");
        User anna = new User("2", "Anna Carla", "annacarla@gmail.com");

        ArrayList<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(gabriel, anna));

        return ResponseEntity.ok().body(list);
    }
}
