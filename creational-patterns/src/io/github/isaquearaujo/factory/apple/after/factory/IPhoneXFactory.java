package io.github.isaquearaujo.factory.apple.after.factory;


import io.github.isaquearaujo.factory.apple.after.model.IPhone;
import io.github.isaquearaujo.factory.apple.after.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneX();
	}

}
