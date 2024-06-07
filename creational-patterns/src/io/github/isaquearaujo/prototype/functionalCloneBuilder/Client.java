package io.github.isaquearaujo.prototype.functionalCloneBuilder;

import io.github.isaquearaujo.prototype.functionalCloneBuilder.model.Address;
import io.github.isaquearaujo.prototype.functionalCloneBuilder.model.User;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		User user = new User("ToClone", 25, new Address("ABC Street", 1000));
		System.out.println(user);
		
		User cloneUser = user.cloneBuilder().withName("Cloned++").now();
		System.out.println(cloneUser);
		
		User anotherUser = cloneUser.cloneBuilder()
				.withAge(100)
				.withAddress(new Address("A Street", 500))
				.now();
		System.out.println(anotherUser);
	}
}