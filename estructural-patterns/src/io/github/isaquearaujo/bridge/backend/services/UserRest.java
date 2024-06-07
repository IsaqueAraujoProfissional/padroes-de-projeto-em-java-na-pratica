package io.github.isaquearaujo.bridge.backend.services;

import io.github.isaquearaujo.bridge.backend.dao.UserDao;
import io.github.isaquearaujo.bridge.backend.model.User;

public class UserRest extends UserService {

	public UserRest(UserDao dao) {
		super(dao);
	}

	@Override
	public void save(User user) {
		System.out.println("Starting a save operation through Rest Protocol!");
		dao.save(user);
	}
}
