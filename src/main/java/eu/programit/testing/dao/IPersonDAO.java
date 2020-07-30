package eu.programit.testing.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import eu.programit.testing.model.Person;

public interface IPersonDAO extends JpaRepository<Person, Long> {
	
}
