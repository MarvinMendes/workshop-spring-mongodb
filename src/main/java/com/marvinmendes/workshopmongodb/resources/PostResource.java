package com.marvinmendes.workshopmongodb.resources;

import com.marvinmendes.workshopmongodb.domain.Post;
import com.marvinmendes.workshopmongodb.resources.util.URL;
import com.marvinmendes.workshopmongodb.services.impl.PostServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    //filtra por palavras contidas em no título de um post
    @GetMapping(value = "/titlesearch")
    public ResponseEntity<List<Post>> getByTitle(@RequestParam(value = "text", defaultValue = "") String text) {
        text = URL.decodeParam(text);
        List<Post> postsByTitle = service.getByTitle(text);
        return ResponseEntity.ok().body(postsByTitle);
    }

}
