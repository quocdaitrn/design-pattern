package vn.self.training.designpattern.behavioral.command;

/**
 * The Command for turning on the light - ConcreteCommand #1
 */
public class FlipUpCommand implements Command {
    private Light light;

    public FlipUpCommand(final Light light) {
        this.light = light;
    }

    @Override
    public void excute() {
        this.light.turnOn();
    }
}
