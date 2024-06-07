package io.github.isaquearaujo.factory.apple.after.factory;

import io.github.isaquearaujo.factory.apple.after.model.IPhone;
import io.github.isaquearaujo.factory.apple.after.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneXSMax();
	}

}
