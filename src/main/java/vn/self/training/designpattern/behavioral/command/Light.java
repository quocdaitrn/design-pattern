package vn.self.training.designpattern.behavioral.command;

/** The Receiver class */
public class Light {
    public void turnOn() {
        System.out.println("Turn on the light");
    }

    public void turnOff() {
        System.out.println("Turn off the light");
    }
}
