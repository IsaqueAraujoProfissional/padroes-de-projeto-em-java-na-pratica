package io.github.isaquearaujo.decorator.coffeeShop.model.decorators;


import io.github.isaquearaujo.decorator.coffeeShop.model.Drink;

public abstract class DrinkDecorator implements Drink {
	protected Drink drink;
	
	public DrinkDecorator(Drink drink) {
		this.drink = drink;
	}
}