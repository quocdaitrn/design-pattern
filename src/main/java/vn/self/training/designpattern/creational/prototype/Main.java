package vn.self.training.designpattern.creational.prototype;

public class Main {
    public static void main(String args[]) {
        Prototype prototype1 = new ConcretePrototype1();
        Prototype prototype2 = new ConcretePrototype2();

        Prototype clonePrototype1 = null;
        Prototype clonePrototype2 = null;

        try {
            clonePrototype1 = prototype1.clone();
            clonePrototype2 = prototype2.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        if (clonePrototype1 != null) {
            System.out.println(clonePrototype1.getDescription());
        } else {
            System.out.println("Can not clone prototype1");
        }

        if (clonePrototype2 != null) {
            System.out.println(clonePrototype2.getDescription());
        } else {
            System.out.println("Can not clone prototype2");
        }
    }
}
