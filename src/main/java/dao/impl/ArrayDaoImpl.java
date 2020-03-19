package dao.impl;

import java.util.ArrayList;
import java.util.List;

import dao.UserDao;
import domen.User;

public class ArrayDaoImpl implements UserDao {
	
	private List<User> list;
	
	public ArrayDaoImpl() {
		list = new ArrayList<User>();
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
