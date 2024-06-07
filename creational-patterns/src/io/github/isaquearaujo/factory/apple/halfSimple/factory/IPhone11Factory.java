package io.github.isaquearaujo.factory.apple.halfSimple.factory;

import io.github.isaquearaujo.factory.apple.halfSimple.model.IPhone;
import io.github.isaquearaujo.factory.apple.halfSimple.model.IPhone11;
import io.github.isaquearaujo.factory.apple.halfSimple.model.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhone11();
		} else if(level.equals("highEnd")) {
			return new IPhone11Pro();
		} else return null;
	}

}
