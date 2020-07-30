package eu.programit.testing.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import eu.programit.testing.model.Person;

@RunWith(SpringRunner.class)
@DataJpaTest
public class IPersonDAOTest {

//	@Autowired
//	private TestEntityManager entityManager;

	@Autowired
	private IPersonDAO iPersonDAO;

	@Test
	public void test_count() {
		Assert.assertEquals( this.iPersonDAO.count(), 2);
	}
	
	@Test
	public void test_findById() {
		Person person = this.iPersonDAO.findById(1L).get();

		Assert.assertEquals(person.getName(), "Person 1");
	}

}