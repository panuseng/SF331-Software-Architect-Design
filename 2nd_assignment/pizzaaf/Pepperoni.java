public interface Pepperoni {
	public String toString();
	public double cost();
}

class SlicedPepperoni implements Pepperoni {
	Ingrediant ingrediant;

	public SlicedPepperoni() {
		this.ingrediant = null;
	}

	public SlicedPepperoni(Ingrediant ingrediant) {
		this.ingrediant = ingrediant;
	}

	public String toString() {
		if (ingrediant != null) {
			return ingrediant.toString() + "Sliced Pepperoni";
		}
		return "Sliced Pepperoni";
	}
	
	public double cost() {
		if (ingrediant != null) {
			return ingrediant.cost() + 5;
		}
		return 5;
	}
}
