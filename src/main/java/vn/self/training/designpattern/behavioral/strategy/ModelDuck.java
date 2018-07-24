package vn.self.training.designpattern.behavioral.strategy;

public class ModelDuck extends Duck {
    public ModelDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck. I can change my features");
    }
}
