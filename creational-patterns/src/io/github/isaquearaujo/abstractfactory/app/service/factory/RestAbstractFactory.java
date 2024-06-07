package io.github.isaquearaujo.abstractfactory.app.service.factory;

import io.github.isaquearaujo.abstractfactory.app.service.services.CarRestApiService;
import io.github.isaquearaujo.abstractfactory.app.service.services.CarService;
import io.github.isaquearaujo.abstractfactory.app.service.services.UserRestApiService;
import io.github.isaquearaujo.abstractfactory.app.service.services.UserService;

public class RestAbstractFactory implements ServicesAbstractFactory {

	@Override
	public UserService getUserService() {
		return new UserRestApiService();
	}

	@Override
	public CarService getCarService() {
		return new CarRestApiService();
	}

}
