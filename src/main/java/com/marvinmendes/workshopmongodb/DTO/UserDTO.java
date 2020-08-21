package com.marvinmendes.workshopmongodb.DTO;

import com.marvinmendes.workshopmongodb.domain.User;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class UserDTO implements Serializable {
    private static final long serialVersionUID = 7484015017621119841L;

    private String id;
    private String name;
    private String email;

    public UserDTO(){}

    public UserDTO(User obj) {
        this.id = obj.getId();
        this.name = obj.getName();
        this.email = obj.getEmail();
    }
}
