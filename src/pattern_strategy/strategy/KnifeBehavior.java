package pattern_strategy.strategy;

public class KnifeBehavior implements WeaponBehavior {

    public void useWeapon() {
        System.out.println("Выполнена атака ножом");
    }
}

class BowAndArrowsBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("Выпущена стрела из лука");
    }
}

class AxeBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("Выполнена атака топором");
    }
}

class SwordBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("Выполнена атака мечом");
    }
}

