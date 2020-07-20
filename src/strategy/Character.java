package strategy;

public abstract class Character {
    WeaponBehavior weapon;

    public Character() {

    }

    public void fight() {
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}

class Queen extends Character {

    public Queen() {
        weapon = new KnifeBehavior();
    }
}

class King extends Character {

    public King() {
        weapon = new BowAndArrowsBehavior();
    }
}

class Knight extends Character {
    public Knight() {
        weapon = new SwordBehavior();
    }
}

class Troll extends Character {
    public Troll() {
        weapon = new AxeBehavior();
    }
}
