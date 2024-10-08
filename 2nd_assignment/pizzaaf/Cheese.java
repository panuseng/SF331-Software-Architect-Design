public interface Cheese {
	public String toString();
	public double cost();
}

class MozzarellaCheese implements Cheese {
	Ingrediant ingrediant;

	public MozzarellaCheese() {
		this.ingrediant = null;
	}

	public MozzarellaCheese(Ingrediant ingrediant) {
		this.ingrediant = ingrediant;
	}

	public String toString() {
		if (ingrediant != null) {
			return ingrediant.toString() + "Shredded Mozzarella";
		}
		return "Shredded Mozzarella";
	}

	public double cost() {
		if (ingrediant != null) {
			return ingrediant.cost() + 5;
		}
		return 5;
	}
}

class ParmesanCheese implements Cheese {
	Ingrediant ingrediant;

	public ParmesanCheese() {
		this.ingrediant = null;
	}

	public ParmesanCheese(Ingrediant ingrediant) {
		this.ingrediant = ingrediant;
	}

	public String toString() {
		if (ingrediant != null) {
			return ingrediant.toString() + "Shredded Parmesan";
		}
		return "Shredded Parmesan";
	}

	public double cost() {
		if (ingrediant != null) {
			return ingrediant.cost() + 10;
		}
		return 10;
	}
}

class ReggianoCheese implements Cheese {
	Ingrediant ingrediant;

	public ReggianoCheese() {
		this.ingrediant = null;
	}

	public ReggianoCheese(Ingrediant ingrediant) {
		this.ingrediant = ingrediant;
	}

	public String toString() {
		if (ingrediant != null) {
			return ingrediant.toString() + "Reggiano Cheese";
		}
		return "Reggiano Cheese";
	}

	public double cost() {
		if (ingrediant != null) {
			return ingrediant.cost() + 15;
		}
		return 15;
	}
}