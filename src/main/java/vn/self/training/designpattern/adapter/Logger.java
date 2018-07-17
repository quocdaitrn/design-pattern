package vn.self.training.designpattern.adapter;

public abstract class Logger {
    public abstract void debug(String s);

    public abstract void trace(String s);

    public abstract void info(String s);

    public static Logger create() {
        return new LoggerImplementation();
    }
}
