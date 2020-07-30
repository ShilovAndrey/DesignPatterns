package pattern_factory;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Изготавливает пиццу " + name);
        dough = ingredientFactory.createDough();
        cheese = ingredientFactory.createCheese();
        sauce = ingredientFactory.createSauce();
    }
}

class ClamPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Изготавливает пиццу " + name);
        dough = ingredientFactory.createDough();
        cheese = ingredientFactory.createCheese();
        sauce = ingredientFactory.createSauce();
        clam = ingredientFactory.createClam();
    }
}

class PepperoniPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Изготавливает пиццу " + name);
        dough = ingredientFactory.createDough();
        cheese = ingredientFactory.createCheese();
        sauce = ingredientFactory.createSauce();
        clam = ingredientFactory.createClam();
    }
}
