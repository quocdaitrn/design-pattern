package vn.self.training.designpattern.structural.composite.composite;

import vn.self.training.designpattern.structural.composite.component.Expression;

public class Subtracter extends BinaryExpression {

    public Subtracter(Expression left, Expression right) {
        super(left, right);
    }

    public double getValue() {
        return left.getValue() - right.getValue();
    }
}
