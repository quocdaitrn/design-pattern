package vn.self.training.designpattern.behavioral.command;

public class Client {
    public static void main(String args[]) {
        Switch sw = new Switch();

        Light light = new Light();

        Command flipUp = new FlipUpCommand(light);
        Command flipDown = new FlipDownCommand(light);

        sw.storeAndExcute(flipUp);
        sw.storeAndExcute(flipDown);
    }
}
