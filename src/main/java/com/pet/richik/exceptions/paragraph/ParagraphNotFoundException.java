package com.pet.richik.exceptions.paragraph;

public class ParagraphNotFoundException extends RuntimeException{
    ParagraphNotFoundException(Long id) {
        super("Could not find paragraph" + id);
    }
}
