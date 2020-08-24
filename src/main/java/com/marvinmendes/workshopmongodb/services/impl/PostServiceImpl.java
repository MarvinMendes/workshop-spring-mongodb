package com.marvinmendes.workshopmongodb.services.impl;

import com.marvinmendes.workshopmongodb.DTO.PostDTO;
import com.marvinmendes.workshopmongodb.domain.Post;
import com.marvinmendes.workshopmongodb.domain.User;
import com.marvinmendes.workshopmongodb.exception.ObjectNotFoundException;
import com.marvinmendes.workshopmongodb.repository.PostRepository;
import com.marvinmendes.workshopmongodb.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository repository;

    @Override
    public Post save(Post post) {
        return repository.insert(post);
    }

    @Override
    public Post getById(String id) {
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> getByTitle(String text) {
        return repository.searchByTitle(text);
    }
}
