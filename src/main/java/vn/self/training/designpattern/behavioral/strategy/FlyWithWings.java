package vn.self.training.designpattern.behavioral.strategy;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm fly with wings");
    }
}
