package io.github.isaquearaujo.abstractfactory.apple.factory;

import io.github.isaquearaujo.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import io.github.isaquearaujo.abstractfactory.apple.model.iphone.IPhone;
import io.github.isaquearaujo.abstractfactory.apple.model.iphone.IPhoneX;
import io.github.isaquearaujo.abstractfactory.apple.model.iphone.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhoneXFactory(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	public IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhoneX(rules);
		} else if(level.equals("highEnd")) {
			return new IPhoneXSMax(rules);
		} else return null;
	}

}
