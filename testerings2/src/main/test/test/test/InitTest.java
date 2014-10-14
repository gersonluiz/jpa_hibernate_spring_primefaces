package test.test;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import test.entity.Users;
import test.repository.UsersRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/applicationContext.xml")
public class InitTest {

	@Inject
	private UsersRepository usersRepository;

	@Test
	public void testInject() throws Exception {
		Users u = usersRepository.getById(1);
		System.out.println(u);
	}
}
