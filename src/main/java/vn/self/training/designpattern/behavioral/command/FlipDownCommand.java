package vn.self.training.designpattern.behavioral.command;

/**
 * The Command for turning off the light - ConcreteCommand #2
 */
public class FlipDownCommand implements Command {
    private Light light;

    public FlipDownCommand(final Light light) {
        this.light = light;
    }

    @Override
    public void excute() {
        this.light.turnOff();
    }
}
