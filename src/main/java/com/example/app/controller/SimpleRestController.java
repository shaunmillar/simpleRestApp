package com.example.app.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.model.Greeting;

@RestController
@RequestMapping("/greetings")
public class SimpleRestController {

		private List<Greeting> greetings;

	    public SimpleRestController() {
	        greetings = new ArrayList<>();
	        greetings.add(new Greeting("Hello!"));
	        greetings.add(new Greeting("Nice to see you"));
	        greetings.add(new Greeting("Good Day!"));
	    }

	    @GetMapping("/{id}")
	    public Greeting getGreetingById(@PathVariable("id") final int id) {
	        return greetings.get(id - 1); // list index starts with 0 but we prefer to start on 1
	    }

	    @GetMapping("/random")
	    public Greeting getRandom() {
			System.out.println("Heard a call to random endpoint.");
			return greetings.get(new Random().nextInt(greetings.size()));
	    }

	    @PostMapping
	    @ResponseStatus(HttpStatus.OK)
	    public void createGreeting(@RequestBody Greeting greeting) {
	        greetings.add(greeting);
	    }
	}
