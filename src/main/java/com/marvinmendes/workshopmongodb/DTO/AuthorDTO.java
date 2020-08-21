package com.marvinmendes.workshopmongodb.DTO;

import com.marvinmendes.workshopmongodb.domain.User;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class AuthorDTO implements Serializable {
    private static final long serialVersionUID = 5270222816696898077L;

    private String id;
    private String name;

    public AuthorDTO(){}

    public AuthorDTO(User user) {
        this.id = user.getId();
        this.name = user.getName();
    }

}
