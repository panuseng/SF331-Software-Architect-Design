interface coffee {
	String getDescription();
	int getCost();
}

class Americano implements coffee {
	public String getDescription() {
		return "Americano";
	}

	public int getCost() {
		return 0;
	}
}

class Caffe_Latte implements coffee {
	public String getDescription() {
		return "Caffe_Latte";
	}

	public int getCost() {
		return 0;
	}
}

abstract class CoffeeDecorator implements coffee {
	protected coffee coffee;

	public CoffeeDecorator(coffee coffee) {
		this.coffee = coffee;
	}

	public String getDescription() {
		return coffee.getDescription();
	}

	public int getCost() {
		return coffee.getCost();
	}
}

class Add_Esspresso_Shot extends CoffeeDecorator {
	public Add_Esspresso_Shot(coffee coffee) {
		super(coffee);
	}

	public String getDescription() {
		return super.getDescription() + " ingridients : Esspresso_Shot";
	}

	public int getCost() {
		return super.getCost() + 10;
	}
}

class Add_Milk extends CoffeeDecorator {
	public Add_Milk(coffee coffee) {
		super(coffee);
	}

	public String getDescription() {
		return super.getDescription() + ", Milk";
	}

	public int getCost() {
		return super.getCost() + 5;
	}
}


class Add_Hot_waver extends CoffeeDecorator {
	public Add_Hot_waver(coffee coffee) {
		super(coffee);
	}

	public String getDescription() {
		return super.getDescription() + ", Hot_waver";
	}

	public int getCost() {
		return super.getCost() + 3;
	}
}

public class Apply_Decorator_2 {
	public static void main(String[] args) {
		coffee coffee = new Americano();
		coffee = new Add_Esspresso_Shot(coffee);
		coffee = new Add_Hot_waver(coffee);
		System.out.println(coffee.getDescription());
		System.out.println(coffee.getCost()+ " THB");

		coffee = new Caffe_Latte();
		coffee = new Add_Esspresso_Shot(coffee);
		coffee = new Add_Milk(coffee);
		System.out.println(coffee.getDescription());
		System.out.println(coffee.getCost()+ " THB");
	}
}
