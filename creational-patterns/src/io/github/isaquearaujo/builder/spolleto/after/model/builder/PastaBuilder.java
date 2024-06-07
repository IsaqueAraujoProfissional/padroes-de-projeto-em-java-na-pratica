package io.github.isaquearaujo.builder.spolleto.after.model.builder;


import io.github.isaquearaujo.builder.spolleto.after.model.Pasta;

public class PastaBuilder extends MealBuilderOpt {

	public Pasta getResult() {
		return new Pasta(toppings, sauces, size, cheese, pepper);
	}
}
