package io.github.isaquearaujo.abstractfactory.app.service;


import io.github.isaquearaujo.abstractfactory.app.service.factory.EJBAbstractFactory;
import io.github.isaquearaujo.abstractfactory.app.service.factory.ServicesAbstractFactory;
import io.github.isaquearaujo.abstractfactory.app.service.services.CarService;
import io.github.isaquearaujo.abstractfactory.app.service.services.UserService;

public class Client {

	public static void main(String[] args) {
		ServicesAbstractFactory factory = new EJBAbstractFactory();
//		ServicesAbstractFactory factory = new RestAbstractFactory();
		
		UserService userService = factory.getUserService();
		userService.save("Jhon");
		userService.delete(5);
		
		CarService carService = factory.getCarService();
		carService.save("Prius");
		carService.update("Tesla X");
	}
}
