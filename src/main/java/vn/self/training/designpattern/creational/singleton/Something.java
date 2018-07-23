package vn.self.training.designpattern.creational.singleton;

public class Something {
    private Something() {
        System.out.println("Something.Something");
    }

    private static class LazyHolder {
        static final Something INSTANCE = new Something();
    }

    public static Something getInstance() {
        return LazyHolder.INSTANCE;
    }
}

