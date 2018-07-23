package vn.self.training.designpattern.factorymethod;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private List<Shape> shapes;
    public Client() {
        this.shapes = new ArrayList<>();
    }

    public void readShapes(List<String> shapeDesctiptions) {
        shapeDesctiptions.stream().forEach(s -> {
            this.shapes.add(Shape.create(s));
        });
    }

    public void drawAllShapes() {
        shapes.stream().forEach(s -> {
            s.draw();
        });
    }
}
