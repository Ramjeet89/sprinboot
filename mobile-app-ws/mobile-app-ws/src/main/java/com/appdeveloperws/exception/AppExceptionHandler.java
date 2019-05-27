package com.appdeveloperws.exception;

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

    @ExceptionHandler(value = {Exception.class})
        public ResponseEntity<Object> handleAnyException(Exception ex, WebRequest request) {
            String errorMessageDecription = ex.getLocalizedMessage();
            if (errorMessageDecription == null) errorMessageDecription = ex.getLocalizedMessage();
            ErrorMessage message = new ErrorMessage(new Date(), errorMessageDecription);
            return new ResponseEntity<>(message, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(value = {NullPointerException.class,UserServiceException.class})
    public ResponseEntity<Object> handleSpecificExceptions(Exception ex, WebRequest request) {
        String errorMessageDecription = ex.getLocalizedMessage();
        if (errorMessageDecription == null) errorMessageDecription = ex.getLocalizedMessage();
        ErrorMessage message = new ErrorMessage(new Date(), errorMessageDecription);
        return new ResponseEntity<>(message, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
