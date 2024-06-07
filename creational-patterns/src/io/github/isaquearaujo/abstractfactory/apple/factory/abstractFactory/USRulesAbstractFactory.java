package io.github.isaquearaujo.abstractfactory.apple.factory.abstractFactory;

import io.github.isaquearaujo.abstractfactory.apple.model.certificate.Certificate;
import io.github.isaquearaujo.abstractfactory.apple.model.certificate.USCertificate;
import io.github.isaquearaujo.abstractfactory.apple.model.packing.Packing;
import io.github.isaquearaujo.abstractfactory.apple.model.packing.USPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new USCertificate();
	}

	public Packing getPacking() {
		return new USPacking();
	}

}
