package vn.self.training.designpattern.behavioral.strategy;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can't quack, I'm mute");
    }
}
