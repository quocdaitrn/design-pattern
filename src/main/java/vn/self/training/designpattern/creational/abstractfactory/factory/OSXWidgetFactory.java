package vn.self.training.designpattern.creational.abstractfactory.factory;

import vn.self.training.designpattern.creational.abstractfactory.product.OSXScrollbar;
import vn.self.training.designpattern.creational.abstractfactory.product.OSXWindow;
import vn.self.training.designpattern.creational.abstractfactory.product.Scrollbar;
import vn.self.training.designpattern.creational.abstractfactory.product.Window;

public class OSXWidgetFactory implements WidgetFactory {
    private Window window;
    private Scrollbar scrollbar;

    public OSXWidgetFactory() {
        this.window = new OSXWindow();
        this.scrollbar = new OSXScrollbar();
    }

    @Override
    public void createWindow() {
        this.window.display();
    }

    @Override
    public void createScrollbar() {
        this.scrollbar.display();
    }
}
