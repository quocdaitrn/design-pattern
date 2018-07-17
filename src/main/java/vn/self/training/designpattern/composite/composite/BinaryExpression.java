package vn.self.training.designpattern.composite.composite;

import vn.self.training.designpattern.composite.component.Expression;

public abstract class BinaryExpression implements Expression {
    protected Expression left;
    protected Expression right;

    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public abstract double getValue();
}
