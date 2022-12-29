package com.mobileappws.exceptions;

import com.mobileappws.model.ErrorMessage;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class AppExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<Object> handleAnyException(Exception e, WebRequest webRequest) {
        String message = e.getLocalizedMessage();
        if (message == null) message = e.toString();

        ErrorMessage errorMessage = new ErrorMessage(message, new Date());

        return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(value = NullPointerException.class)
    public ResponseEntity<Object> handleNullPointerException(NullPointerException e, WebRequest webRequest) {
        String message = e.getLocalizedMessage();
        if (message == null) message = e.toString();

        ErrorMessage errorMessage = new ErrorMessage(message, new Date());

        return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(value = UserServiceException.class)
    public ResponseEntity<Object> handleUserServiceException(UserServiceException e, WebRequest webRequest) {
        String message = e.getLocalizedMessage();
        if (message == null) message = e.toString();

        ErrorMessage errorMessage = new ErrorMessage(message, new Date());

        return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
