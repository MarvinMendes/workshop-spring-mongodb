package com.marvinmendes.workshopmongodb.services;

import com.marvinmendes.workshopmongodb.domain.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {
    Post save(Post user);
}
