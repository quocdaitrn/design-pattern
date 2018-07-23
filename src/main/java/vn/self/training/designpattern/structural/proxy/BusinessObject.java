package vn.self.training.designpattern.structural.proxy;

public abstract class BusinessObject {
    public abstract void print();
    static BusinessObject create() {
        return new BusinessObjectProxy(new BusinessObjectImplementation());
    }
}
