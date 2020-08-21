package com.marvinmendes.workshopmongodb.resources;

import com.marvinmendes.workshopmongodb.domain.Post;
import com.marvinmendes.workshopmongodb.services.impl.PostServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/posts")
public class PostResource {

    private final PostServiceImpl service;

    //busca um post por ID
    @GetMapping(value = "/{id}")
    public ResponseEntity<Post> getById(@PathVariable String id) {
        Post post = service.getById(id);
        return ResponseEntity.ok().body(post);
    }

}
