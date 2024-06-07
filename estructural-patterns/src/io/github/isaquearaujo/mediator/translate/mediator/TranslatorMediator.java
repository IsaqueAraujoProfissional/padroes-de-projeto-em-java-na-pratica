package io.github.isaquearaujo.mediator.translate.mediator;


import io.github.isaquearaujo.mediator.translate.model.User;
import io.github.isaquearaujo.mediator.translate.services.Translator;

public class TranslatorMediator extends Mediator {

	private Translator translator = new Translator();

	protected String getMessage(String message, User to, User from) {
		return translator.getTranslation(from.getLanguage(), to.getLanguage(), message);
	}
}
