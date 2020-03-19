package config;

import org.springframework.context.annotation.Bean;

import dao.UserDao;
import dao.impl.ArrayDaoImpl;
import dao.impl.ListDaoImpl;
import domen.User;
import main.Main;
import service.UserService;
import service.impl.UserServiceImpl;

public class MyBeanConfig {
	@Bean (name = "main")
	public Main getMain() {
		return new Main();
	}
	
	@Bean (name = "user")
	public User getUser() {
		return new User();
	}
	
	@Bean (name = "userService")
	public UserService getUserService() {
		return new UserServiceImpl();
	}
	
	@Bean (name = "arrayDao")
	public UserDao getArrayDao() {
		return new ArrayDaoImpl();
	}
	
	@Bean (name = "listDao")
	public UserDao getListDao() {
		return new ListDaoImpl();
	}
}
