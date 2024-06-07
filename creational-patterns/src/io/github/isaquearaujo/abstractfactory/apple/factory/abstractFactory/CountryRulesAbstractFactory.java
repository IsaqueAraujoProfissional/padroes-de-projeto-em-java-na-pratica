package io.github.isaquearaujo.abstractfactory.apple.factory.abstractFactory;


import io.github.isaquearaujo.abstractfactory.apple.model.certificate.Certificate;
import io.github.isaquearaujo.abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
