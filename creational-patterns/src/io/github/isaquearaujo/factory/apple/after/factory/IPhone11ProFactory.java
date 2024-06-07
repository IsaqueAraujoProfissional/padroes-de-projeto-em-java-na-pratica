package io.github.isaquearaujo.factory.apple.after.factory;


import io.github.isaquearaujo.factory.apple.after.model.IPhone;
import io.github.isaquearaujo.factory.apple.after.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11Pro();
	}
}
