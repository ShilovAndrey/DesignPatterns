package pattern_strategy.strategyBird;

public abstract class Bird {
        JumpBehavior jump;
        EatBehavior eat;

        public void jump(){
            jump.jump();
        }

        public void eat(){
            eat.eat();
        }

        public void setJumpBehavior(JumpBehavior jb){
            jump=jb;
        }

        public void setEatBehavior(EatBehavior eb){
            eat=eb;
        }
}

class SlimBird extends Bird{
    public SlimBird(){
        jump= new SlimBirdJump();
        eat=new SlimBirdEat();
    }
}

class NormalBird extends Bird{
    public NormalBird(){
        jump=new NormalBirdJump();
        eat= new NormalBirdEat();
    }
}

class FatBird extends Bird{
    public FatBird(){
        jump=new FatBirdJump();
        eat=new FatBirdEat();
    }
}
