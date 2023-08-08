package com.pet.richik.exceptions.paragraph;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ParagrephNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler (ParagraphNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String employeeNotFoundHandler(ParagraphNotFoundException ex) {
        return ex.getMessage();
    }
}
