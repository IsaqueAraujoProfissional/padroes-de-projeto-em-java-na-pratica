package io.github.isaquearaujo.abstractfactory.apple.factory.abstractFactory;


import io.github.isaquearaujo.abstractfactory.apple.model.certificate.BrazilianCertificate;
import io.github.isaquearaujo.abstractfactory.apple.model.certificate.Certificate;
import io.github.isaquearaujo.abstractfactory.apple.model.packing.BrazilianPacking;
import io.github.isaquearaujo.abstractfactory.apple.model.packing.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new BrazilianCertificate();
	}

	public Packing getPacking() {
		return new BrazilianPacking();
	}

}
