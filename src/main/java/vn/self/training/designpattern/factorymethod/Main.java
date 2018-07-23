package vn.self.training.designpattern.factorymethod;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        List<String> shapeDescriptions = new ArrayList<>();
        shapeDescriptions.add("#rect 1,1,100,100");
        shapeDescriptions.add("#oval 1,2,10,10");

        Client client = new Client();
        client.readShapes(shapeDescriptions);
        client.drawAllShapes();
    }
}
