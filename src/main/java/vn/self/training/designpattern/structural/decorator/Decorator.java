package vn.self.training.designpattern.structural.decorator;

public abstract class Decorator implements IngredientInterface {

    protected IngredientInterface obj;

    public Decorator(IngredientInterface obj) {
        this.obj = obj;
    }
}
