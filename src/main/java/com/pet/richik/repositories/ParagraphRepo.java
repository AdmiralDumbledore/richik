package com.pet.richik.repositories;

import com.pet.richik.models.Paragraph;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ParagraphRepo extends JpaRepository<Paragraph, Integer> {
}
