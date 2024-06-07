package io.github.isaquearaujo.abstractfactory.app.service.factory;


import io.github.isaquearaujo.abstractfactory.app.service.services.CarEJBService;
import io.github.isaquearaujo.abstractfactory.app.service.services.CarService;
import io.github.isaquearaujo.abstractfactory.app.service.services.UserEJBService;
import io.github.isaquearaujo.abstractfactory.app.service.services.UserService;

public class EJBAbstractFactory implements ServicesAbstractFactory {

	@Override
	public UserService getUserService() {
		return new UserEJBService();
	}

	@Override
	public CarService getCarService() {
		return new CarEJBService();
	}

}



