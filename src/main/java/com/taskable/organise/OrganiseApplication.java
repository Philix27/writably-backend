package com.taskable.organise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class OrganiseApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrganiseApplication.class, args);
	}

	@GetMapping("/greet")
	public GreetingsResponse greet(){
		return new GreetingsResponse(
				"Hula",
				List.of("Java", "Golang", "Javascript"),
				new Person("Jake"));
	}

	record Person(String name){}
	record GreetingsResponse(
			String greet,
			List<String> favLang,
			Person person
	){};
}
