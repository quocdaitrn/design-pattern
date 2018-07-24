package vn.self.training.designpattern.behavioral.strategy;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack, quack, quack");
    }
}
