package pattern_factory;

public interface Dough {
}

class NYDough implements Dough {
    public NYDough() {
        System.out.println("Используется тонкая основа");
    }
}

class ChicagoDough implements Dough {
    public ChicagoDough() {
        System.out.println("Используется толстая основа");
    }
}

interface Cheese {

}

class NYCheese implements Cheese {
    public NYCheese() {
        System.out.println("используется Нью-Йорский сыр");
    }
}

class ChicagoCheese implements Cheese {
    public ChicagoCheese() {
        System.out.println("Используется Чикагский сыр");
    }
}

interface Sauce {
}

class NYSauce implements Sauce {
    public NYSauce() {
        System.out.println("Добавляется Нью-Йоркский соус");
    }
}

class ChicagoSauce implements Sauce {
    public ChicagoSauce() {
        System.out.println("Добавляется Чикагский соус");
    }
}

interface Clam {
}

class NYClam implements Clam {
    public NYClam() {
        System.out.println("Добавляем свежие мидии");
    }
}

class ChicagoClam implements Clam {
    public ChicagoClam() {
        System.out.println("Добавляем замороженные мидии");
    }
}