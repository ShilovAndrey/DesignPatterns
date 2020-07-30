package pattern_factory;

public abstract class PizzaStore {
    public Pizza orderPizza(String pizzaType) {
        Pizza pizza = null;
        pizza = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String pizzaType);
}

class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYIngredientFactory();
        if (pizzaType.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York style Cheese Pizza");
        } else if (pizzaType.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York style Clam Pizza");
        } else if (pizzaType.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York style Pepperoni Pizza");
        } else {
            System.out.println("Такого блюда нет в меню");
        }
        return pizza;
    }
}

class ChicagoPizzaStore extends PizzaStore {
    protected Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoIngredientFactory();
        if (pizzaType.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago style Cheese Pizza");
        } else if (pizzaType.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago style Clam Pizza");
        } else if (pizzaType.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago style Pepperoni Pizza");
        }
        return pizza;
    }
}