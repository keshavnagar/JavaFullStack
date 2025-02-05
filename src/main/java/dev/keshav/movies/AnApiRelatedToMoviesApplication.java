package dev.keshav.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AnApiRelatedToMoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnApiRelatedToMoviesApplication.class, args);
	}
	@GetMapping("/root")
	public String apiRoot(){
		return "love you keshav";
	}
}
