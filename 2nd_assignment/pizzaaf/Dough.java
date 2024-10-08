public interface Dough {
	public String toString();
	public double cost();
}

class ThickCrustDough implements Dough {
	public String toString() {
		return "ThickCrust style extra thick crust dough";
	}

	public double cost() {
		return 5;
	}
}

class ThinCrustDough implements Dough {
	public String toString() {
		return "Thin Crust Dough";
	}

	public double cost() {
		return 10;
	}
}
