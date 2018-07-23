package vn.self.training.designpattern.creational.abstractfactory.factory;

import vn.self.training.designpattern.creational.abstractfactory.product.MSScrollbar;
import vn.self.training.designpattern.creational.abstractfactory.product.MSWindow;
import vn.self.training.designpattern.creational.abstractfactory.product.Scrollbar;
import vn.self.training.designpattern.creational.abstractfactory.product.Window;

public class MSWidgetFactory implements WidgetFactory {
    private Window window;
    private Scrollbar scrollbar;

    public MSWidgetFactory() {
        this.window = new MSWindow();
        this.scrollbar = new MSScrollbar();

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
