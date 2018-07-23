package vn.self.training.designpattern.structural.adapter;

public class Main {
    public static void main(String args[]) {
        Logger logger = Logger.create();
        logger.debug("Hello, there\n");
        logger.trace("Nice to meet all you\n");
        logger.info("Goodbye\n");
    }
}
