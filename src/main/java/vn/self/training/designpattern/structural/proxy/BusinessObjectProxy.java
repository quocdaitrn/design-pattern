package vn.self.training.designpattern.structural.proxy;

public class BusinessObjectProxy extends BusinessObject {

    private BusinessObject target;

    public BusinessObjectProxy(BusinessObject target) {
        this.target = target;
    }

    public void print() {
        this.target.print();
    }
}
