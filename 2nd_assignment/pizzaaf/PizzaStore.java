public abstract class PizzaStore {

	protected abstract Pizza createPizza(String item);

	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		if (pizza == null) {
			System.out.println("Error: invalid type of pizza");
			return null;
		}
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}

class ChicagoPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory =
		new ChicagoPizzaIngredientFactory();

		switch (item) {
			case "cheese":
				pizza = new CheesePizza(ingredientFactory);
				pizza.setName("Chicago Style Cheese Pizza");

				Dough dough = new ThickCrustDough();
				Ingrediant ingrediant = new IngrediantAdaptor(dough);
				ingrediant = new IngrediantAdaptor(new PlumTomatoSauce(ingrediant));
				ingrediant = new IngrediantAdaptor(new MozzarellaCheese(ingrediant));

				pizza.setCost(ingrediant.cost());
				break;

			case "veggie":
				pizza = new VeggiePizza(ingredientFactory);
				pizza.setName("Chicago Style Veggie Pizza");

				dough = new ThickCrustDough();
				ingrediant = new IngrediantAdaptor(dough);
				ingrediant = new IngrediantAdaptor(new PlumTomatoSauce(ingrediant));
				ingrediant = new IngrediantAdaptor(new MozzarellaCheese(ingrediant));
				ingrediant = new IngrediantAdaptor(new BlackOlives(ingrediant));
				ingrediant = new IngrediantAdaptor(new Spinach(ingrediant));
				ingrediant = new IngrediantAdaptor(new Eggplant(ingrediant));

				pizza.setCost(ingrediant.cost());
				break;

			case "clam":
				pizza = new ClamPizza(ingredientFactory);
				pizza.setName("Chicago Style Clam Pizza");

				dough = new ThickCrustDough();
				ingrediant = new IngrediantAdaptor(dough);
				ingrediant = new IngrediantAdaptor(new PlumTomatoSauce(ingrediant));
				ingrediant = new IngrediantAdaptor(new MozzarellaCheese(ingrediant));
				ingrediant = new IngrediantAdaptor(new FrozenClams(ingrediant));

				pizza.setCost(ingrediant.cost());
				break;

			case "pepperoni":
				pizza = new PepperoniPizza(ingredientFactory);
				pizza.setName("Chicago Style Pepperoni Pizza");

				dough = new ThickCrustDough();
				ingrediant = new IngrediantAdaptor(dough);
				ingrediant = new IngrediantAdaptor(new PlumTomatoSauce(ingrediant));
				ingrediant = new IngrediantAdaptor(new MozzarellaCheese(ingrediant));
				ingrediant = new IngrediantAdaptor(new BlackOlives(ingrediant));
				ingrediant = new IngrediantAdaptor(new Spinach(ingrediant));
				ingrediant = new IngrediantAdaptor(new Eggplant(ingrediant));
				ingrediant = new IngrediantAdaptor(new SlicedPepperoni(ingrediant));

				pizza.setCost(ingrediant.cost());
				break;

			default:
				return null;
		}
		return pizza;
	}
}

class NYPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

		switch (item) {
			case "cheese":
				pizza = new CheesePizza(ingredientFactory);
				pizza.setName("New York Style Cheese Pizza");

				Dough dough = new ThinCrustDough();
				Ingrediant ingrediant = new IngrediantAdaptor(dough);
				ingrediant = new IngrediantAdaptor(new MarinaraSauce(ingrediant));
				ingrediant = new IngrediantAdaptor(new ReggianoCheese(ingrediant));

				pizza.setCost(ingrediant.cost());
				break;

			case "veggie":
				pizza = new VeggiePizza(ingredientFactory);
				pizza.setName("New York Style Veggie Pizza");

				dough = new ThinCrustDough();
				ingrediant = new IngrediantAdaptor(dough);
				ingrediant = new IngrediantAdaptor(new MarinaraSauce(ingrediant));
				ingrediant = new IngrediantAdaptor(new ReggianoCheese(ingrediant));
				ingrediant = new IngrediantAdaptor(new Garlic(ingrediant));
				ingrediant = new IngrediantAdaptor(new Mushroom(ingrediant));
				ingrediant = new IngrediantAdaptor(new RedPepper(ingrediant));

				pizza.setCost(ingrediant.cost());
				break;

			case "clam":
				pizza = new ClamPizza(ingredientFactory);
				pizza.setName("New York Style Clam Pizza");

				dough = new ThinCrustDough();
				ingrediant = new IngrediantAdaptor(dough);
				ingrediant = new IngrediantAdaptor(new MarinaraSauce(ingrediant));
				ingrediant = new IngrediantAdaptor(new ReggianoCheese(ingrediant));
				ingrediant = new IngrediantAdaptor(new FreshClams(ingrediant));

				pizza.setCost(ingrediant.cost());
				break;

			case "pepperoni":
				pizza = new PepperoniPizza(ingredientFactory);
				pizza.setName("New York Style Pepperoni Pizza");

				dough = new ThinCrustDough();
				ingrediant = new IngrediantAdaptor(dough);
				ingrediant = new IngrediantAdaptor(new MarinaraSauce(ingrediant));
				ingrediant = new IngrediantAdaptor(new ReggianoCheese(ingrediant));
				ingrediant = new IngrediantAdaptor(new Garlic(ingrediant));
				ingrediant = new IngrediantAdaptor(new Mushroom(ingrediant));
				ingrediant = new IngrediantAdaptor(new RedPepper(ingrediant));
				ingrediant = new IngrediantAdaptor(new SlicedPepperoni(ingrediant));

				pizza.setCost(ingrediant.cost());
				break;

			default:
				return null;
		}
		return pizza;
	}
}

