public interface Veggies {
	public String toString();
	public double cost();
}

class BlackOlives implements Veggies {
	Ingrediant ingrediant;

	public BlackOlives() {
		this.ingrediant = null;
	}

	public BlackOlives(Ingrediant ingrediant) {
		this.ingrediant = ingrediant;
	}

	public String toString() {
		if (ingrediant != null) {
			return ingrediant.toString() + "Black Olives";
		}
		return "Black Olives";
	}

	public double cost() {
		if (ingrediant != null) {
			return ingrediant.cost() + 5;
		}
		return 5;
	}
}

class Eggplant implements Veggies {
	Ingrediant ingrediant;

	public Eggplant() {
		this.ingrediant = null;
	}

	public Eggplant(Ingrediant ingrediant) {
		this.ingrediant = ingrediant;
	}

	public String toString() {
		if (ingrediant != null) {
			return ingrediant.toString() + "Eggplant";
		}
		return "Eggplant";
	}

	public double cost() {
		if (ingrediant != null) {
			return ingrediant.cost() + 10;
		}
		return 10;
	}
}

class Garlic implements Veggies {
	Ingrediant ingrediant;

	public Garlic() {
		this.ingrediant = null;
	}

	public Garlic(Ingrediant ingrediant) {
		this.ingrediant = ingrediant;
	}

	public String toString() {
		if (ingrediant != null) {
			return ingrediant.toString() + "Garlic";
		}
		return "Garlic";
	}

	public double cost() {
		if (ingrediant != null) {
			return ingrediant.cost() + 15;
		}
		return 15;
	}
}

class Mushroom implements Veggies {
	Ingrediant ingrediant;

	public Mushroom() {
		this.ingrediant = null;
	}

	public Mushroom(Ingrediant ingrediant) {
		this.ingrediant = ingrediant;
	}

	public String toString() {
		if (ingrediant != null) {
			return ingrediant.toString() + "Mushrooms";
		}
		return "Mushrooms";
	}

	public double cost() {
		if (ingrediant != null) {
			return ingrediant.cost() + 20;
		}
		return 20;
	}
}

class Onion implements Veggies {
	Ingrediant ingrediant;

	public Onion() {
		this.ingrediant = null;
	}

	public Onion(Ingrediant ingrediant) {
		this.ingrediant = ingrediant;
	}

	public String toString() {
		if (ingrediant != null) {
			return ingrediant.cost() + "Onion";
		}
		return "Onion";
	}

	public double cost() {
		if (ingrediant != null) {
			return ingrediant.cost() + 25;
		}
		return 25;
	}
}

class RedPepper implements Veggies {
	Ingrediant ingrediant;

	public RedPepper() {
		this.ingrediant = null;
	}

	public RedPepper(Ingrediant ingrediant) {
		this.ingrediant = ingrediant;
	}

	public String toString() {
		if (ingrediant != null) {
			return ingrediant.toString() + "Red Pepper";
		}
		return "Red Pepper";
	}

	public double cost() {
		if (ingrediant != null) {
			return ingrediant.cost() + 5;
		}
		return 5;
	}
}

class Spinach implements Veggies {
	Ingrediant ingrediant;

	public Spinach() {
		this.ingrediant = null;
	}

	public Spinach(Ingrediant ingrediant) {
		this.ingrediant = ingrediant;
	}

	public String toString() {
		if (ingrediant != null) {
			return ingrediant.cost() + "Spinach";
		}
		return "Spinach";
	}

	public double cost() {
		if (ingrediant != null) {
			return ingrediant.cost() + 30;
		}
		return 30;
	}
}
