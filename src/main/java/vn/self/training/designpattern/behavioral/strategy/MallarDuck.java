package vn.self.training.designpattern.behavioral.strategy;

public class MallarDuck extends Duck {
    public MallarDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallar duck");
    }
}
