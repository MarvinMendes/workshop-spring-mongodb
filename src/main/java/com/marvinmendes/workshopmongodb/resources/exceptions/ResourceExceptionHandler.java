package com.marvinmendes.workshopmongodb.resources.exceptions;

import com.marvinmendes.workshopmongodb.exception.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;

@ControllerAdvice
public class ResourceExceptionHandler implements Serializable {
    private static final long serialVersionUID = 2506668552912153038L;

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException exception, HttpServletRequest request) {

        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError error = new StandardError(System.currentTimeMillis(), status.value(), "Não encontrado", exception.getMessage(), request.getRequestURI());

        return ResponseEntity.status(status).body(error);
    }



}
