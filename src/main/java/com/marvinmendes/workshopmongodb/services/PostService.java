package com.marvinmendes.workshopmongodb.services;

import com.marvinmendes.workshopmongodb.domain.Post;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface PostService {
    Post save(Post user);
    Post getById(String id);
    List<Post> fullSearch(String text, Date minDate, Date maxDate);

}
