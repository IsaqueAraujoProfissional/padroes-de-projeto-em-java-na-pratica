package io.github.isaquearaujo.facade.callCenter.isolated.services;

import io.github.isaquearaujo.facade.callCenter.isolated.model.Card;
import io.github.isaquearaujo.facade.callCenter.isolated.model.Register;

import java.util.*;

public class RegisterService {
	private Map<Long, List<Register>> memory;
	
	public RegisterService() {
		memory = new HashMap<Long, List<Register>>();
		memory.put(11223344L, new ArrayList<>(Arrays.asList(
				new Register("McDonalds", 15d, new Date()),
				new Register("Pizza Hut", 25d, new Date()),
				new Register("Nike Store", 50d, new Date())
			)));
	}

	public List<Register> getRegistersByCard(Card card) {
		return memory.get(card.getCardNumber());
	}

	public void removeByIndex(Card card, int i) {
		List<Register> list = memory.get(card.getCardNumber());
		Register reg = list.remove(i);
		System.out.println(reg.toString() + " Deleted!");
		memory.put(card.getCardNumber(), list);
	}

	public void deleteCardRegistries(Card card) {
		memory.remove(card.getCardNumber());
	}
	
	public void addCardRegisters(Card card, List<Register> registers) {
		System.out.println("Associating pending Registers to new Card!");
		memory.put(card.getCardNumber(), registers);
	}
}
