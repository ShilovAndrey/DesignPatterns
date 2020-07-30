package pattern_factory;

public class FactoryTest {

    public static void main(String[] args) {

        PizzaStore nyPizza = new NYPizzaStore();
        PizzaStore chicagoPizza = new ChicagoPizzaStore();

        Pizza pizza = nyPizza.orderPizza("cheese");
        System.out.println("I ordered " + pizza.getName());
        System.out.println();

        pizza = chicagoPizza.orderPizza("pepperoni");
        System.out.println("Friend ordered " + pizza.getName());

    }
}
