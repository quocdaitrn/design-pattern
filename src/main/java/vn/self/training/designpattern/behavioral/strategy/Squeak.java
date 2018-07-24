package vn.self.training.designpattern.behavioral.strategy;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak, squeak, squeak");
    }
}
