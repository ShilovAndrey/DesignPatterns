package pattern_decorater;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
    }

    public double cost() {
        double price = 0;
        if (getSize() == Size.BIG)
            price = 0.89;
        else if (getSize() == Size.MEDIUM)
            price = 0.75;
        else if (getSize() == Size.LITTLE)
            price = 0.6;
        return price;
    }
}

class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "DarkRoast";
    }

    public double cost() {
        double price = 0;
        if (getSize() == Size.BIG)
            price = 0.89;
        else if (getSize() == Size.MEDIUM)
            price = 0.75;
        else if (getSize() == Size.LITTLE)
            price = 0.6;
        return price;
    }
}

class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        double price = 0;
        if (getSize() == Size.BIG)
            price = 0.89;
        else if (getSize() == Size.MEDIUM)
            price = 0.75;
        else if (getSize() == Size.LITTLE)
            price = 0.6;
        return price;
    }
}

class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf";
    }

    public double cost() {
        double price = 0;
        if (getSize() == Size.BIG)
            price = 0.89;
        else if (getSize() == Size.MEDIUM)
            price = 0.75;
        else if (getSize() == Size.LITTLE)
            price = 0.6;
        return price;
    }
}