package dao.impl;

import java.util.LinkedList;
import java.util.List;

import dao.UserDao;
import domen.User;

public class ListDaoImpl implements UserDao {
	
	private List<User> list;
	
	public ListDaoImpl() {
		list = new LinkedList<User>();
	}

	public void save(User user) {
		list.add(user);
	}
	
	public void printUsers() {
		for(User user : list) {
			System.out.println(user);
		}
	}

}
