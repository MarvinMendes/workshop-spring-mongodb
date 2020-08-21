package com.marvinmendes.workshopmongodb.resources.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class StandardError implements Serializable {
    private static final long serialVersionUID = -8658319077495551559L;

    private Long timestamp;
    private Integer tatus;
    private String error;
    private String message;
    private String path;

}
