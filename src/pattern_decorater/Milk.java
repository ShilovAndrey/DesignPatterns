package pattern_decorater;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    public double cost() {
        double price = beverage.cost();
        if (beverage.getSize() == Size.BIG)
            price += 0.15;
        else if (beverage.getSize() == Size.MEDIUM)
            price += 0.10;
        else if (beverage.getSize() == Size.LITTLE)
            price += 0.5;
        return price;
    }
}

class Chocolate extends CondimentDecorator {

    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Chocolate";
    }

    public double cost() {
        double price = beverage.cost();
        if (beverage.getSize() == Size.BIG)
            price += 0.15;
        else if (beverage.getSize() == Size.MEDIUM)
            price += 0.10;
        else if (beverage.getSize() == Size.LITTLE)
            price += 0.5;
        return price;
    }
}

class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        double price = beverage.cost();
        if (beverage.getSize() == Size.BIG)
            price += 0.15;
        else if (beverage.getSize() == Size.MEDIUM)
            price += 0.10;
        else if (beverage.getSize() == Size.LITTLE)
            price += 0.5;
        return price;
    }
}

class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        double price = beverage.cost();
        if (beverage.getSize() == Size.BIG)
            price += 0.15;
        else if (beverage.getSize() == Size.MEDIUM)
            price += 0.10;
        else if (beverage.getSize() == Size.LITTLE)
            price += 0.5;
        return price;
    }
}