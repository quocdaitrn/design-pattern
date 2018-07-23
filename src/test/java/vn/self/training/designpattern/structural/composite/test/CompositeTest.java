package vn.self.training.designpattern.structural.composite.test;

import org.junit.Test;
import vn.self.training.designpattern.structural.composite.component.Expression;
import vn.self.training.designpattern.structural.composite.composite.Adder;
import vn.self.training.designpattern.structural.composite.composite.Divider;
import vn.self.training.designpattern.structural.composite.composite.Multilier;
import vn.self.training.designpattern.structural.composite.composite.Subtracter;
import vn.self.training.designpattern.structural.composite.leaf.Constant;

import static org.junit.Assert.assertEquals;

public class CompositeTest {
    @Test
    public void testConstant() {
        double a = 3.0;
        Expression eA = new Constant(a);

        assertEquals(a, eA.getValue(), 0.0);
    }

    @Test
    public void testAdder() {
        double a = 3.0;
        double b = 5.0;

        Expression eA = new Constant(a);
        Expression eB = new Constant(b);
        Expression value = new Adder(eA, eB);

        assertEquals(a + b, value.getValue(), 0.0);
    }

    @Test
    public void testSubtracter() {
        double a = 3.0;
        double b = 5.0;

        Expression eA = new Constant(a);
        Expression eB = new Constant(b);
        Expression value = new Subtracter(eA, eB);

        assertEquals(a - b, value.getValue(), 0.0);
    }

    @Test
    public void testDivider() {
        double a = 3.0;
        double b = 5.0;

        Expression eA = new Constant(a);
        Expression eB = new Constant(b);
        Expression value = new Divider(eA, eB);

        assertEquals(a / b, value.getValue(), 0.00001);
    }

    @Test
    public void testMultilier() {
        double a = 3.0;
        double b = 5.0;

        Expression eA = new Constant(a);
        Expression eB = new Constant(b);
        Expression value = new Multilier(eA, eB);

        assertEquals(a * b, value.getValue(), 0.0);
    }

    @Test
    public void testComposite() {
        Expression value = new Divider(
                new Multilier(
                        new Adder(
                                new Constant(12.0),new Constant(9.0)),
                        new Constant(7.0)
                ),
                new Subtracter(
                        new Constant(9.0), new Constant(4.0)
                )
        );

        assertEquals(29.4, value.getValue(), 0.00000001);
    }
}
