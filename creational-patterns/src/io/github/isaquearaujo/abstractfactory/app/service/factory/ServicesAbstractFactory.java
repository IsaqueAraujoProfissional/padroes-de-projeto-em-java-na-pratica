package io.github.isaquearaujo.abstractfactory.app.service.factory;


import io.github.isaquearaujo.abstractfactory.app.service.services.CarService;
import io.github.isaquearaujo.abstractfactory.app.service.services.UserService;

public interface ServicesAbstractFactory {

	UserService getUserService();
	
	CarService getCarService();
}
