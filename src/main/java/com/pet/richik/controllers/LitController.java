package com.pet.richik.controllers;

import com.pet.richik.models.Paragraph;
import com.pet.richik.repositories.ParagraphRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LitController {

    @Autowired
    private ParagraphRepo paragraphRepo;
    @GetMapping("/lib")
    public String libraryMain(Model model){
        Iterable<Paragraph> paragraphs = paragraphRepo.findAll();
        model.addAttribute("paragraphs", paragraphs);
        return "library_main";
    }

}
