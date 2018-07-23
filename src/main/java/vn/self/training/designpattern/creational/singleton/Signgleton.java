package vn.self.training.designpattern.creational.singleton;

public class Signgleton {
    private static volatile Signgleton sInstance;
    private String description;

    private Signgleton() {
        // private constructor to hidden public constructor
        this.description = "Singleton";
    }

    public static Signgleton getInstance() {
        Signgleton instance = sInstance;
        if (instance == null) {
            // double check locking
            synchronized (Signgleton.class) {
                instance = sInstance;
                if (instance == null) {
                    System.out.println("Create new Singleton instance");
                    sInstance = instance = new Signgleton();
                }
            }
        }

        return instance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
