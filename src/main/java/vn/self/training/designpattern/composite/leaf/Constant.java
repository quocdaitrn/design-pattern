package vn.self.training.designpattern.composite.leaf;

import vn.self.training.designpattern.composite.component.Expression;

public class Constant implements Expression {

    private double value;

    public Constant(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
