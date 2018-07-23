package vn.self.training.designpattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * The Invoker class
 */
public class Switch {
    private List<Command> history = new ArrayList<>();

    public void storeAndExcute(Command command) {
        this.history.add(command);
        command.excute();
    }
}
