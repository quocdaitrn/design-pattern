package vn.self.training.designpattern.composite.composite;

import vn.self.training.designpattern.composite.component.Expression;

public class Adder extends BinaryExpression {

    public Adder(Expression left, Expression right) {
        super(left, right);
    }

    public double getValue() {
        return left.getValue() + right.getValue();
    }
}
