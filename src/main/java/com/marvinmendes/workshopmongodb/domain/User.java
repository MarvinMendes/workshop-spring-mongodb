package com.marvinmendes.workshopmongodb.domain;

import javafx.geometry.Pos;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Document
public class User implements Serializable {
    private static final long serialVersionUID = 8389901439337667030L;

    @Id
    private String id;
    private String name;
    private String email;
    @DBRef(lazy = true)
    private List<Post> posts = new ArrayList<>();

    public User(){}

    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    public User(String id, String name, String email, List<Post> posts) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.posts = posts;
    }

}
