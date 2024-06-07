package io.github.isaquearaujo.mediator.translate.model;


import io.github.isaquearaujo.mediator.translate.mediator.Mediator;

public class EnglishUser extends User {

	public EnglishUser(String name, Mediator mediator) {
		super(name, mediator, Language.ENGLISH);
	}
	
}
