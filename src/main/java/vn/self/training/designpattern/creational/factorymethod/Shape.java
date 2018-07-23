package vn.self.training.designpattern.creational.factorymethod;

import java.lang.reflect.UndeclaredThrowableException;

public interface Shape {
    void draw();

    static Shape create(String s) {
        if (s.startsWith("#rect")) {
            return new Rectangle();
        } else if (s.startsWith("#oval")) {
            return new Oval();
        }

        throw new UndeclaredThrowableException(new Exception());
    }
}
