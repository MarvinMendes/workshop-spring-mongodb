package com.marvinmendes.workshopmongodb.DTO;

import com.marvinmendes.workshopmongodb.domain.User;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class CommentDTO implements Serializable {
    private static final long serialVersionUID = -6978026110776470410L;

    private String text;
    private Date date;
    private AuthorDTO authorDTO;

    public CommentDTO(){}

    public CommentDTO(String text, Date date, AuthorDTO authorDTO) {
        this.text = text;
        this.date = date;
        this.authorDTO = authorDTO;
    }
}
