package vn.self.training.designpattern.creational.abstractfactory.product;

public class OSXWindow implements Window {
    @Override
    public void display() {
        System.out.println("OSXWindow.display");
    }
}
