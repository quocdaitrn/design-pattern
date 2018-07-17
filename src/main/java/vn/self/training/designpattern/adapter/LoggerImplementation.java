package vn.self.training.designpattern.adapter;

public class LoggerImplementation extends Logger {
    public void debug(String s) {
        System.out.printf("Debug: %s", s);
    }

    public void trace(String s) {
        System.out.printf("Trace: %s", s);
    }

    public void info(String s) {
        System.out.printf("Info: %s", s);
    }
}
