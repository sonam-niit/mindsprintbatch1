package com.mindsprint.restapi;

import com.mindsprint.restapi.model.User;
import com.mindsprint.restapi.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestapiApplicationTests {

	@Autowired
	UserService service;
	@Test
	void checkAddUser() {
		User user= new User();
		user.setName("Alex");user.setEmail("alex@gmail.com");
		user.setCountry("US");
		Assertions.assertNotNull(service.addUser(user));
	}
	@Test
	void checkName(){
		Assertions.assertEquals("Alex",service.getUserById((long)1).getName());
	}
	@Test
	void updateTest(){
		User user= new User();
		user.setName("Alex John");
		user.setCountry("UK");
		Assertions.assertEquals("Alex John",
				service.updateUser(user,(long)1).getName());
	}
	@Test
	void deleteTest(){
		Assertions.assertTrue(service.deleteUserById((long)1));
		Assertions.assertFalse(service.deleteUserById((long)1));
	}
}
