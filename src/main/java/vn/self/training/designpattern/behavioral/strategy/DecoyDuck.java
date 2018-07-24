package vn.self.training.designpattern.behavioral.strategy;

public class DecoyDuck extends Duck {
    public DecoyDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("I'm a Decoy duck");
    }
}
