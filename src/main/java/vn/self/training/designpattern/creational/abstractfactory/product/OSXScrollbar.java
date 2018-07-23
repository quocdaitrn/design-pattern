package vn.self.training.designpattern.creational.abstractfactory.product;

public class OSXScrollbar implements Scrollbar {
    @Override
    public void display() {
        System.out.println("OSXScrollbar.display");
    }
}
