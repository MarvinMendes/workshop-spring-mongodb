package com.marvinmendes.workshopmongodb.domain;

import com.marvinmendes.workshopmongodb.DTO.AuthorDTO;
import com.marvinmendes.workshopmongodb.DTO.CommentDTO;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Document
public class Post implements Serializable {
    private static final long serialVersionUID = 5069096823277918775L;

    @Id
    @EqualsAndHashCode.Include
    private String id;
    private Date date;
    private String title;
    private String body;
    private AuthorDTO author;

    private List<CommentDTO> comments = new ArrayList<>();

    public Post() {
    }

    public Post(String id, Date date, String title, String body, AuthorDTO author) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.body = body;
        this.author = author;
    }
}
