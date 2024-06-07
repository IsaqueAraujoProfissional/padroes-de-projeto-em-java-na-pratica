package io.github.isaquearaujo.bridge.backend.services;


import io.github.isaquearaujo.bridge.backend.dao.UserDao;
import io.github.isaquearaujo.bridge.backend.model.User;

public class UserEJB extends UserService {

	public UserEJB(UserDao dao) {
		super(dao);
	}

	@Override
	public void save(User user) {
		System.out.println("Starting a save operation through EJB Protocol!");
		dao.save(user);
	}
}
