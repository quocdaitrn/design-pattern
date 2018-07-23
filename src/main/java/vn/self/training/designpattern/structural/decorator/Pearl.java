package vn.self.training.designpattern.structural.decorator;

public class Pearl extends Decorator {

    public Pearl(IngredientInterface obj) {
        super(obj);
    }

    @Override
    public double cost() {
        return obj.cost() + 10.0;
    }

    @Override
    public String getDescription() {
        return obj.getDescription() + ", Pearl";
    }
}
