package com.pet.richik;
import com.pet.richik.models.Paragraph;
import com.pet.richik.repositories.ParagraphRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(ParagraphRepo repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Paragraph(1,"asd")));
            log.info("Preloading " + repository.save(new Paragraph(2,"афыа")));
        };
    }
}