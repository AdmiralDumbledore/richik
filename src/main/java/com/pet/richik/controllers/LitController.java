package com.pet.richik.controllers;

import com.pet.richik.models.Paragraph;
import com.pet.richik.repositories.ParagraphRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LitController {

    private final ParagraphRepo repository;
    public LitController(ParagraphRepo repository) {
        this.repository = repository;
    }

    @GetMapping("/lib")
    List<Paragraph> all(){
        return repository.findAll();
    }

    @PostMapping("/lib")
    Paragraph newParagraph(@RequestBody Paragraph newParagraph){
        return repository.save(newParagraph);
    }

//    @GetMapping("/lib")
//    public String libraryMain(Model model){
//        Iterable<Paragraph> paragraphs = paragraphRepo.findAll();
//        model.addAttribute("paragraphs", paragraphs);
//        return "library_main";
//    }



}
