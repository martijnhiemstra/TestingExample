package eu.programit.testing.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import eu.programit.testing.dao.IPersonDAO;
import eu.programit.testing.model.Person;

@Service
@Transactional
public class PersonService {

	private final IPersonDAO iPersonDAO;

	public PersonService(IPersonDAO iPersonDAO) {
		this.iPersonDAO = iPersonDAO;
	}

	public Optional<Person> findById(final Long id) {
		return this.iPersonDAO.findById(id);
	}

	public List<Person> findAll() {
		return this.iPersonDAO.findAll();
	}
	
	// Create en Update methods that also include validation

}
