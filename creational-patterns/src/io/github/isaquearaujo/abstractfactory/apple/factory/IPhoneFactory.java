package io.github.isaquearaujo.abstractfactory.apple.factory;


import io.github.isaquearaujo.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import io.github.isaquearaujo.abstractfactory.apple.model.iphone.IPhone;

public abstract class IPhoneFactory {
	CountryRulesAbstractFactory rules;
	
	public IPhoneFactory(CountryRulesAbstractFactory rules) {
		this.rules = rules;
	}

	public IPhone orderIPhone(String level) {
		IPhone device = null;
		
		device = createIPhone(level);
		
		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();
		
		return device;
	}
	
	protected abstract IPhone createIPhone(String level);
}
