package io.github.isaquearaujo.bridge.backend.services;


import io.github.isaquearaujo.bridge.backend.dao.UserDao;
import io.github.isaquearaujo.bridge.backend.model.User;

public class UserSoap extends UserService {

	public UserSoap(UserDao dao) {
		super(dao);
	}

	@Override
	public void save(User user) {
		System.out.println("Starting a save operation through Soap Protocol!");
		dao.save(user);
	}
}
