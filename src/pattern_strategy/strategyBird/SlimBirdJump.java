package pattern_strategy.strategyBird;

public class SlimBirdJump implements JumpBehavior {
    public void jump(){
        System.out.println("Птица прыгает высоко");
    }
}

class FatBirdJump implements JumpBehavior{
    public void jump(){
        System.out.println("толстяк еле подпрыгнул");
    }
}

class NormalBirdJump implements JumpBehavior{
    public void jump(){
        System.out.println("птица подпрыгнула на среднюю высоту");
    }
}