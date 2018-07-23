package vn.self.training.designpattern.structural.decorator;

public class MilkTea implements IngredientInterface {
    private String description;

    public MilkTea() {
        this.description = "MilkTea";
    }

    @Override
    public double cost() {
        return 30.0;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
