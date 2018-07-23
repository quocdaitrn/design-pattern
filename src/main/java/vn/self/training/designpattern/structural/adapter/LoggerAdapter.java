package vn.self.training.designpattern.structural.adapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.impl.Log4JLogger;

public class LoggerAdapter extends Logger {
    private Log log = new Log4JLogger();

    public void debug(String s) {
        log.debug(s);
    }

    public void trace(String s) {
        log.trace(s);
    }

    public void info(String s) {
        log.info(s);
    }
}
