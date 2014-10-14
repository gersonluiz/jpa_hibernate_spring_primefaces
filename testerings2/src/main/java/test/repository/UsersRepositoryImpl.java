package test.repository;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import test.entity.Users;

@Named("usersRepository")
public class UsersRepositoryImpl implements UsersRepository {
	
	@PersistenceContext(unitName = "entityManager")
	private EntityManager em;

	public Users getById(Integer id) {
		return em.find(Users.class, id);
	}

	public void save(Users u) {
		em.persist(u);
	}
	

}
