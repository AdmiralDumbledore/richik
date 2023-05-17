package com.pet.richik;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class RichikApplication {

	public static void main(String[] args) {
		SpringApplication.run(RichikApplication.class, args);
		log.info("\n = \nServer started \n =");
	}

}
