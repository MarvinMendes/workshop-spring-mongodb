package com.marvinmendes.workshopmongodb.DTO;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class PostDTO implements Serializable {
    private static final long serialVersionUID = 4105638972546903797L;

    private String id;
    private Date date;
    private String title;
    private String body;
    private AuthorDTO author;

    public PostDTO(){}

    public PostDTO(String id, Date date, String title, String body, AuthorDTO author) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.body = body;
        this.author = author;
    }
}
