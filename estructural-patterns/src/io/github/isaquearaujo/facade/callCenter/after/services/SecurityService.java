package io.github.isaquearaujo.facade.callCenter.after.services;


import io.github.isaquearaujo.facade.callCenter.after.model.Card;
import io.github.isaquearaujo.facade.callCenter.after.model.Register;

import java.util.List;

public class SecurityService {
	private CardService cardService;
	private RegisterService registerService;
	
	public SecurityService(CardService cardService, RegisterService registerService) {
		this.cardService = cardService;
		this.registerService = registerService;
	}

	public List<Register> blockCard(Card card) {
		System.out.println("Blocking card:" + card);
		List<Register> pendingRegistries = registerService.getRegistersByCard(card);
		cardService.removeCard(card);
		registerService.deleteCardRegistries(card);
		return pendingRegistries;
	}
}
