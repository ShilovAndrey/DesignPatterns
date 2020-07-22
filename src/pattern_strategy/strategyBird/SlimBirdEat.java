package pattern_strategy.strategyBird;

public class SlimBirdEat implements EatBehavior {
    public void eat(){
        System.out.println("Птица съела только часть корма");
    }
}

class NormalBirdEat implements EatBehavior{
    public void eat(){
        System.out.println("Птица съела весь корм");
    }
}

class FatBirdEat implements EatBehavior{
    public void eat(){
        System.out.println("Птица все съела и хочет еще");
    }
}
