package com.marvinmendes.workshopmongodb.exception;

import java.io.Serializable;

public class ObjectNotFoundException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = 4314788644130433870L;

    public ObjectNotFoundException(String msg) {
        super(msg);
    }
}
