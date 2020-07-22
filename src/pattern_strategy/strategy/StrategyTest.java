package pattern_strategy.strategy;

public class StrategyTest {

    public static void main(String[] args) {
        King king = new King();
        king.fight();
        king.setWeapon(new SwordBehavior());
        king.fight();
    }
}
