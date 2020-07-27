package pattern_decorater;

public class DecoratorTest {

    public static void main(String[] args) {

        Beverage beverage = new HouseBlend();
        beverage.setSize(Beverage.Size.MEDIUM);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new Espresso();
        beverage2.setSize(Beverage.Size.BIG);
        beverage2 = new Milk(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
        beverage2 = new Milk(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
