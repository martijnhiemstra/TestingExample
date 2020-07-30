package eu.programit.testing.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import eu.programit.testing.model.Person;
import eu.programit.testing.service.PersonService;

@RestController
public class PersonController {

	private final PersonService personService;

	public PersonController(final PersonService personService) {
		this.personService = personService;
	}

	@GetMapping("/api/person/{id}")
	public Optional<Person> findById(@PathVariable("id") Long id) {
		return this.personService.findById(id);
	}

	@GetMapping("/api/person/all")
	public List<Person> findAll() {
		return this.personService.findAll();
	}

}
