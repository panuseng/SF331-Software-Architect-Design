interface Pizza {
	String getDescription();
	int getCost();
}

class Hawaiian implements Pizza {
	public String getDescription() {
		return "Hawaiin Pizza";
	}

	public int getCost() {
		return 0;
	}
}

class Seafood implements Pizza {
	public String getDescription() {
		return "Seafood Pizza";
	}

	public int getCost() {
		return 0;
	}
}

abstract class PizzaDecorator implements Pizza {
	protected Pizza pizza;

	public PizzaDecorator(Pizza pizza) {
		this.pizza = pizza;
	}

	public String getDescription() {
		return pizza.getDescription();
	}

	public int getCost() {
		return pizza.getCost();
	}
}

class Add_pizza_dought extends PizzaDecorator {
	public Add_pizza_dought(Pizza pizza) {
		super(pizza);
	}

	public String getDescription() {
		return super.getDescription() + " ingridients : pizza dought";
	}

	public int getCost() {
		return super.getCost() + 20;
	}
}

class Add_Pineapple extends PizzaDecorator {
	public Add_Pineapple(Pizza pizza) {
		super(pizza);
	}

	public String getDescription() {
		return super.getDescription() + ", Pineapple";
	}

	public int getCost() {
		return super.getCost() + 5;
	}
}

class Add_Cheese extends PizzaDecorator {
	public Add_Cheese(Pizza pizza) {
		super(pizza);
	}

	public String getDescription() {
		return super.getDescription() + ", Cheese";
	}

	public int getCost() {
		return super.getCost() + 8;
	}
}

class Add_Ham extends PizzaDecorator {
	public Add_Ham(Pizza pizza) {
		super(pizza);
	}

	public String getDescription() {
		return super.getDescription() + ", Ham";
	}

	public int getCost() {
		return super.getCost() + 15;
	}
}

class Add_Pepper extends PizzaDecorator {
	public Add_Pepper(Pizza pizza) {
		super(pizza);
	}

	public String getDescription() {
		return super.getDescription() + ", Pepper";
	}

	public int getCost() {
		return super.getCost() + 9;
	}
}

class Add_Shrimp extends PizzaDecorator {
	public Add_Shrimp(Pizza pizza) {
		super(pizza);
	}

	public String getDescription() {
		return super.getDescription() + ", Shrimp";
	}

	public int getCost() {
		return super.getCost() + 7;
	}
}

class Add_Mussels extends PizzaDecorator {
	public Add_Mussels(Pizza pizza) {
		super(pizza);
	}

	public String getDescription() {
		return super.getDescription() + ", Mussels";
	}

	public int getCost() {
		return super.getCost() + 4;
	}
}

class Add_Tomato extends PizzaDecorator {
	public Add_Tomato(Pizza pizza) {
		super(pizza);
	}

	public String getDescription() {
		return super.getDescription() + ", Tomato";
	}

	public int getCost() {
		return super.getCost() + 3;
	}
}

public class Apply_Decorator_1 {
	public static void main(String[] args) {
		Pizza Hawaiin = new Hawaiian();
		Hawaiin = new Add_pizza_dought(Hawaiin);
		Hawaiin = new Add_Pineapple(Hawaiin);
		Hawaiin = new Add_Cheese(Hawaiin);
		Hawaiin = new Add_Ham(Hawaiin);
		Hawaiin = new Add_Tomato(Hawaiin);
		System.out.println(Hawaiin.getDescription());
		System.out.println(Hawaiin.getCost() + "THB");

		Pizza Seafood = new Seafood();
		Seafood = new Add_pizza_dought(Seafood);
		Seafood = new Add_Cheese(Seafood);
		Seafood = new Add_Pepper(Seafood);
		Seafood = new Add_Shrimp(Seafood);
		Seafood = new Add_Mussels(Seafood);
		Seafood = new Add_Tomato(Seafood);
		System.out.println(Seafood.getDescription());
		System.out.println(Seafood.getCost() + "THB");
	}
}
