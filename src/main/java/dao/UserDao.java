package dao;

import domen.User;

public interface UserDao {
	void save(User user);
	
	void printUsers();
}
