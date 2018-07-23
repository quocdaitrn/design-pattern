package vn.self.training.designpattern.structural.composite.leaf;

import vn.self.training.designpattern.structural.composite.component.Expression;

public class Constant implements Expression {

    private double value;

    public Constant(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
