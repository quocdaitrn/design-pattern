package vn.self.training.designpattern.proxy;

public abstract class BusinessObject {
    public abstract void print();
    static BusinessObject create() {
        return new BusinessObjectProxy(new BusinessObjectImplementation());
    }
}
