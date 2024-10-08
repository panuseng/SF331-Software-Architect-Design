public interface Sauce {
	public String toString();
	public double cost();
}

class MarinaraSauce implements Sauce {
	public Ingrediant ingrediant;

	public MarinaraSauce() {
        this.ingrediant = null;
    }

	public MarinaraSauce(Ingrediant ingrediant) {
		this.ingrediant = ingrediant;
	}

	public String toString() {
		if (ingrediant != null) {
			return ingrediant.toString() + "Marinara Sauce";
		}
		return "Marinara Sauce";
	}

	public double cost() {
		if (ingrediant != null) {
			return ingrediant.cost() + 5;
		}
		return 5;
	}
}

class PlumTomatoSauce implements Sauce {
	public Ingrediant ingrediant;

	public PlumTomatoSauce() {
		this.ingrediant = null;
	}

	public PlumTomatoSauce(Ingrediant ingrediant) {
		this.ingrediant = ingrediant;
	}

	public String toString() {
		if (ingrediant != null) {
			return ingrediant.toString() + "Tomato sauce with plum tomatoes";
		}
		return "Tomato sauce with plum tomatoes";
	}

	public double cost() {
		if (ingrediant != null) {
			return ingrediant.cost() + 10;
		}
		return 10;
	}
}

