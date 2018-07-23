package vn.self.training.designpattern.creational.prototype;

public class ConcretePrototype1 extends Prototype {
    public ConcretePrototype1() {
        this.description = super.getDescription() + " : ConcretePrototype1";
    }
}
