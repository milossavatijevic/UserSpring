package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.MyBeanConfig;
import domen.User;
import service.UserService;

public class Main {

	public static void main(String[] args) {
		BeanFactory container = new AnnotationConfigApplicationContext(MyBeanConfig.class);

		Main main = container.getBean("main", Main.class);

		User user1 = container.getBean("user", User.class);
		user1.setName("Milos");
		user1.setLastname("Mikic");
		user1.setUsername("miki");
		user1.setPassword("miki");
		
		User user2 = container.getBean("user", User.class);
		user2.setName("Petar");
		user2.setLastname("Peric");
		user2.setUsername("pera");
		user2.setPassword("pera");
		
		main.addUser(user1);
		main.addUser(user2);
		main.printUsers();

	}

	void addUser(User user) {
		BeanFactory container = new AnnotationConfigApplicationContext(MyBeanConfig.class);

		UserService userService = container.getBean("userService", UserService.class);

		userService.save(user);
	}

	void printUsers() {
		BeanFactory container = new AnnotationConfigApplicationContext(MyBeanConfig.class);

		UserService userService = container.getBean("userService", UserService.class);
		
		userService.printUsers();
	}

}
