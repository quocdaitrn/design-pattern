package vn.self.training.designpattern.composite.composite;

import vn.self.training.designpattern.composite.component.Expression;

public class Multilier extends BinaryExpression {
    public Multilier(Expression left, Expression right) {
        super(left, right);
    }

    public double getValue() {
        return left.getValue() * right.getValue();
    }
}
