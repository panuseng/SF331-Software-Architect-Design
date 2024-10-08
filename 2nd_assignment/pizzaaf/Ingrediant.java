public interface Ingrediant{
    String toString();
    double cost();
}

class IngrediantAdaptor implements Ingrediant{
    Dough dough;
    Sauce sauce;
    Veggies veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    public IngrediantAdaptor(Dough dough) {
        this.dough = dough;
    }

    public IngrediantAdaptor(Sauce sauce) {
        this.sauce = sauce;
    }

    public IngrediantAdaptor(Veggies veggies) {
        this.veggies = veggies;
    }

    public IngrediantAdaptor(Cheese cheese) {
        this.cheese = cheese;
    }

    public IngrediantAdaptor(Pepperoni pepperoni) {
        this.pepperoni = pepperoni;
    }

    public IngrediantAdaptor(Clams clams) {
        this.clams = clams;
    }

    @Override
    public String toString() {
        if (dough != null) {
            return dough.toString();
        } else if (sauce != null) {
            return sauce.toString(); 
        } else if (veggies != null) {
            return veggies.toString();
        } else if (cheese != null) {
            return cheese.toString();
        } else if (pepperoni != null) {
            return pepperoni.toString();
        } else if (clams != null) {
            return clams.toString();
        }
        return "";
    }

    @Override
    public double cost() {
        if (dough != null) {
            return dough.cost();
        } else if (sauce != null) {
            return sauce.cost(); 
        } else if (veggies != null) {
            return veggies.cost();
        } else if (cheese != null) {
            return cheese.cost();
        } else if (pepperoni != null) {
            return pepperoni.cost();
        } else if (clams != null) {
            return clams.cost();
        }
        return 0;
    }
}
