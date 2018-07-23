package vn.self.training.designpattern.structural.proxy;

public class Main {
    public static void main(String args[]) {
        BusinessObject obj = BusinessObject.create();
        obj.print();
    }
}
