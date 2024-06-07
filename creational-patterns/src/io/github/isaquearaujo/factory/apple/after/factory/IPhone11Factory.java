package io.github.isaquearaujo.factory.apple.after.factory;

import io.github.isaquearaujo.factory.apple.after.model.IPhone;
import io.github.isaquearaujo.factory.apple.after.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11();
	}

}
