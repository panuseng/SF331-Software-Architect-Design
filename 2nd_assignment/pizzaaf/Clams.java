public interface Clams {
	public String toString();
	public double cost();
}

class FreshClams implements Clams {
	Ingrediant ingrediant;

	public FreshClams() {
		this.ingrediant = null;
	}

	public FreshClams(Ingrediant ingrediant) {
		this.ingrediant = ingrediant;
	}

	public String toString() {
		if (ingrediant != null) {
			return ingrediant.toString() + "Fresh Clams from Long Island Sound";
		}
		return "Fresh Clams from Long Island Sound";
		
	}

	public double cost() {
		if (ingrediant != null) {
			return ingrediant.cost() + 5;
		}
		return 5;
	}
}

class FrozenClams implements Clams {
	Ingrediant ingrediant;

	public FrozenClams() {
		this.ingrediant = null;
	}

	public FrozenClams(Ingrediant ingrediant) {
		this.ingrediant = ingrediant;
	}

	public String toString() {
		if (ingrediant != null) {
			return ingrediant.toString() + "Frozen Clams from Chesapeake Bay";
		}
		return "Frozen Clams from Chesapeake Bay";
	}

	public double cost() {
		if (ingrediant != null) {
			return ingrediant.cost() + 10;
		}
		return 10;
	}
}