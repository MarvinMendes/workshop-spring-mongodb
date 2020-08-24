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

import java.util.Date;
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

    @Override
    public List<Post> fullSearch(String text, Date minDate, Date maxDate) {
        maxDate = new Date(maxDate.getTime() + 24 * 60 * 60 * 1000);
        return repository.fullSearch(text, minDate, maxDate);
    }

    public List<Post> getByTitle(String text) {
        return repository.searchByTitle(text);
    }


}
