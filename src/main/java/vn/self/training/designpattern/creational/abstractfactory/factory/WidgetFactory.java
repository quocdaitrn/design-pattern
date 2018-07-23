package vn.self.training.designpattern.creational.abstractfactory.factory;

import java.lang.reflect.UndeclaredThrowableException;

public interface WidgetFactory {
    void createWindow();
    void createScrollbar();

    static WidgetFactory getFactory(String OS) {
        switch (OS) {
            case "MS":
                return new MSWidgetFactory();
            case "OSX":
                return new OSXWidgetFactory();
            default:
                throw new UndeclaredThrowableException(new Exception("Unsupported this OS"));
        }
    }
}
