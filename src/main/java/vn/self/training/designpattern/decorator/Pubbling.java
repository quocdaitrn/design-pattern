package vn.self.training.designpattern.decorator;

public class Pubbling extends Decorator {

    public Pubbling(IngredientInterface obj) {
        super(obj);
    }

    @Override
    public double cost() {
        return obj.cost() + 5.0;
    }

    @Override
    public String getDescription() {
        return obj.getDescription() + ", Pubbing";
    }
}
