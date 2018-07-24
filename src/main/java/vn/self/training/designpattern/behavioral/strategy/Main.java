package vn.self.training.designpattern.behavioral.strategy;

public class Main {
    public static void main(String args[]) {
        Duck mallarDuck = new MallarDuck(new FlyWithWings(), new Quack());
        Duck decoyDuck = new DecoyDuck(new FlyNoWay(), new MuteQuack());
        Duck modelDuck = new ModelDuck(new FlyNoWay(), new Squeak());

        mallarDuck.display();
        mallarDuck.performFly();
        mallarDuck.performQuack();
        System.out.println("--------------------");

        decoyDuck.display();
        decoyDuck.performFly();
        decoyDuck.performQuack();
        System.out.println("--------------------");

        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();
        System.out.println("Model duck change behavior:");
        modelDuck.setFlyBehavior(new FlyWithWings());
        modelDuck.setQuackBehavior(new MuteQuack());
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();
    }
}
