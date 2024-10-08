interface Pizzafactory {
	Pizza make();
}

class HawaiianFactory implements Pizzafactory {
	public Pizza make() {
		Pizza Hawaiin = new Hawaiian();
		Hawaiin = new Add_pizza_dought(Hawaiin);
		Hawaiin = new Add_Pineapple(Hawaiin);
		Hawaiin = new Add_Cheese(Hawaiin);
		Hawaiin = new Add_Ham(Hawaiin);
		Hawaiin = new Add_Tomato(Hawaiin);
		return Hawaiin;
	}
}

class SeafoodFactory implements Pizzafactory {
	public Pizza make() {
		Pizza Seafood = new Seafood();
		Seafood = new Add_pizza_dought(Seafood);
		Seafood = new Add_Cheese(Seafood);
		Seafood = new Add_Pepper(Seafood);
		Seafood = new Add_Shrimp(Seafood);
		Seafood = new Add_Mussels(Seafood);
		Seafood = new Add_Tomato(Seafood);
		return Seafood;
	}
}

interface Coffeefactory {
	coffee make();
}

class AmericanoFactory implements Coffeefactory {
	public coffee make() {
		coffee coffee = new Americano();
		coffee = new Add_Esspresso_Shot(coffee);
		coffee = new Add_Hot_waver(coffee);
		return coffee;
	}
}

class LatteFactory implements Coffeefactory {
	public coffee make() {
		coffee coffee = new Caffe_Latte();
		coffee = new Add_Esspresso_Shot(coffee);
		coffee = new Add_Milk(coffee);
		coffee = new Add_Hot_waver(coffee);
		return coffee;
	}
}


public class Apply_Factory_Method {
	public static void main(String[] args) {
		Coffeefactory americanoFactory = new AmericanoFactory();
		coffee americano = americanoFactory.make();
		System.out.println("Americano: " + americano.getDescription());
		System.out.println("Total cost: " + americano.getCost() + " THB");

		Coffeefactory caffeLatteFactory = new LatteFactory();
		coffee caffeLatte = caffeLatteFactory.make();
		System.out.println("\nCaffe Latte: " + caffeLatte.getDescription());
		System.out.println("Total cost: " + caffeLatte.getCost() + " THB");


		Pizzafactory hawaiianFactory = new HawaiianFactory();
		Pizza hawaiianPizza = hawaiianFactory.make();
		System.out.println("\nHawaiian Pizza: " + hawaiianPizza.getDescription());
		System.out.println("Total cost: " + hawaiianPizza.getCost() + " THB");

		Pizzafactory seafoodFactory = new SeafoodFactory();
		Pizza seafoodPizza = seafoodFactory.make();
		System.out.println("\nSeafood Pizza: " + seafoodPizza.getDescription());
		System.out.println("Total cost: " + seafoodPizza.getCost() + " THB");
	}
}
