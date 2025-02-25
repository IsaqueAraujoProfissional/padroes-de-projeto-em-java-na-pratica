package io.github.isaquearaujo.bridge.backend.services;

import io.github.isaquearaujo.bridge.backend.dao.UserDao;
import io.github.isaquearaujo.bridge.backend.model.User;

public abstract class UserService {
	protected UserDao dao;

	public UserService(UserDao dao) {
		this.dao = dao;
	}
	
	public abstract void save(User user);
}
