package pattern_factory;

public interface PizzaIngredientFactory {
    Dough createDough();

    Cheese createCheese();

    Sauce createSauce();

    Clam createClam();
}

class NYIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new NYDough();
    }

    public Cheese createCheese() {
        return new NYCheese();
    }

    public Sauce createSauce() {
        return new NYSauce();
    }

    public Clam createClam() {
        return new NYClam();
    }
}

class ChicagoIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ChicagoDough();
    }

    public Cheese createCheese() {
        return new ChicagoCheese();
    }

    public Sauce createSauce() {
        return new ChicagoSauce();
    }

    public Clam createClam() {
        return new ChicagoClam();
    }
}