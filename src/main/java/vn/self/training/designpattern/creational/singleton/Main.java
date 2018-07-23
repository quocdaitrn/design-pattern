package vn.self.training.designpattern.creational.singleton;

public class Main {
    public static void main(String args[]) {
        Signgleton signgleton = Signgleton.getInstance();
        Signgleton otherSingleton = Signgleton.getInstance();

        otherSingleton.setDescription("Old " + otherSingleton.getDescription());

        System.out.println("singleton : " + signgleton.getDescription());
        System.out.println("other singleton : " + otherSingleton.getDescription());

        System.out.println("--------------------");
        Something something = Something.getInstance();
        Something otherSomething = Something.getInstance();
    }
}
