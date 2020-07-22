package pattern_strategy.strategyBird;

public class StrategyBird {

    public static void main(String[] args) {

        Bird bird = new NormalBird();
        bird.jump();
        bird.eat();
        bird.setEatBehavior(new SlimBirdEat());
        bird.eat();
        bird=new SlimBird();
        bird.jump();
    }
}
