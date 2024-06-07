package io.github.isaquearaujo.adapter.hexagonal.core.ports;

import io.github.isaquearaujo.adapter.hexagonal.core.model.User;

import java.util.List;

public interface UserRepository {
	void save(User user);
	List<User> getAll();
}
