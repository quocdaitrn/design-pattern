package vn.self.training.designpattern.creational.abstractfactory;

import vn.self.training.designpattern.creational.abstractfactory.factory.WidgetFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "OSX");
        map.put(2, "MS");
        Random random = new Random();

        WidgetFactory factory = WidgetFactory.getFactory(
                map.get(random.ints(1,3)
                        .limit(1).findFirst().getAsInt()));

        factory.createWindow();
        factory.createScrollbar();

        System.out.println("Done!");

    }
}
