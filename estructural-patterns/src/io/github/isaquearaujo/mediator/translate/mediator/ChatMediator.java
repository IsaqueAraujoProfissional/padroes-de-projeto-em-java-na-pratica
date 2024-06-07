package io.github.isaquearaujo.mediator.translate.mediator;


import io.github.isaquearaujo.mediator.translate.model.User;

public class ChatMediator extends Mediator {

	public String getMessage(String message, User to, User from) {
		return message;
	}
}
