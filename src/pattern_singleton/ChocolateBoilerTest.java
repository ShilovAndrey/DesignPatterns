package pattern_singleton;

public class ChocolateBoilerTest {
    public static void main(String[] args) {

        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
        chocolateBoiler.fill();
        chocolateBoiler.boil();
        chocolateBoiler.drain();
        chocolateBoiler.boil();
        chocolateBoiler.drain();
        chocolateBoiler.fill();
        chocolateBoiler.drain();
        chocolateBoiler.boil();
        chocolateBoiler.drain();
    }
}

