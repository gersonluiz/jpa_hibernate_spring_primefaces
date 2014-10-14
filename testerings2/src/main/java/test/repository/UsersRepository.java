package test.repository;

import test.entity.Users;

public interface UsersRepository {
	
	public Users getById(Integer id);
	
	public void save(Users u);
	
}
