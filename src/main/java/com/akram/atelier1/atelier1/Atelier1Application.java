package com.akram.atelier1.atelier1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.akram.atelier1.atelier1.presentation.Presentation;

@SpringBootApplication
public class Atelier1Application {

	public static void main(String[] args) {
		SpringApplication.run(Atelier1Application.class, args);

		Presentation.main();
	}

}
