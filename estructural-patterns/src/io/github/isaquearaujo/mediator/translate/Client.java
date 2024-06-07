package io.github.isaquearaujo.mediator.translate;

import io.github.isaquearaujo.mediator.translate.mediator.Mediator;
import io.github.isaquearaujo.mediator.translate.mediator.TranslatorMediator;
import io.github.isaquearaujo.mediator.translate.model.EnglishUser;
import io.github.isaquearaujo.mediator.translate.model.PortugueseUser;
import io.github.isaquearaujo.mediator.translate.model.User;

public class Client {

	public static void main(String[] args) {
		// Mediator chatRoom = new ChatMediator();
		Mediator chatRoom = new TranslatorMediator();
		
		User alan = new EnglishUser("Alan", chatRoom);
		User jose = new PortugueseUser("Jose", chatRoom);
		User sue = new EnglishUser("Sue", chatRoom);
		User maria = new PortugueseUser("Maria", chatRoom);
		
		chatRoom.addUser(alan);
		chatRoom.addUser(sue);
		chatRoom.addUser(maria);
		
		alan.sendMessage("Hello");
		maria.sendMessage("Oi", alan);
		
		chatRoom.removeUser(sue);
		
		alan.sendMessage("How are you?", maria);
		maria.sendMessage("Estou bem, obrigado.", alan);
		
		chatRoom.addUser(jose);
		
		jose.sendMessage("Oi");
		
		chatRoom.removeUser(maria);
	}
	
}